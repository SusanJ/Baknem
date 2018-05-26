lexer grammar BaknemLexer;
@lexer::header {   
 package nem;
 import nemdata.FunctionName;
 import nemdata.ChemicalElement;
}
@lexer::members{  static boolean chkLC_ROMAN_SEQ = false;
  static boolean isFunAbbr( String name ){
    return FunctionName.isBrlFunAbbr( name );
  }
  static boolean isTrailFA( String name){
    return FunctionName.trailingFunAbbr( name );
  }
  static boolean isChemicalSymbol( String brl ){
    return ChemicalElement.isChemicalSymbol( brl );
  }
}

   //Note that "kappa" is omitted because of conflict with .k for equals
fragment GREEK_LETTERs:  ('a'|'b'|'d'..'g'|'i'|'l'..'p'|'r'..'u'|'w'..'z'
                         |'A'|'B'|'D'..'G'|'I'|'L'..'P'|'R'..'U'|'W'..'Z'
                         |':'|'?'|'&'
                         )
                         ;

//A FUN_ABBR is a reserved sequence of two or more small letters
//used as a function name abbreviation per Rule XVII
//A FUNCTION_NAME is a reserved sequence of two or more small letters
//used as a function name per Rule XVII (currently not considered)
                                             
    //Cells no. 1-25, 40 ['w']

 // 2 or more small letters, possible function abbr.
 // or var &InvisibleTimes; function abbr.
LC_ID :  ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z')+
          {if (isFunAbbr( getText() )){
             setType( BaknemParser.FUN_ABBR );
          } //else if{ isTrailFA( getText())){ ...
         }; 
 //Single cap or small letter; s single cap poss. chem. el.
ID    : (',')?('a'..'z'|'A'..'Z')
         {if (isChemicalSymbol( getText() )){
           setType( BaknemParser.POSS_CH_ELEMENT);
         }
        };
  //Single cap followed by single small, likely chem. el.
MIXID : (',')('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z')
         {if (isChemicalSymbol( getText() )){
           setType( BaknemParser.CHEM_ELEMENT);
         }
        };

fragment ROMAN_NUMERALS: ('i'|'v'|'x'|'l'|'c'|'d'|'m'
                         |'I'|'V'|'X'|'L'|'C'|'D'|'M'
                         )
                         ;

CAP_ROMAN_NUM_SEQ: ','',' 
                   ROMAN_NUMERALS ROMAN_NUMERALS (ROMAN_NUMERALS)*
                   ;

//Need all caps  TO-DO
UC_ID :  ',,'('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z')+;


GREEK_LETTER: '.'','? GREEK_LETTERs;

MISCALPHD46: ('@,'('a'|'r'|'p'|'s')
            | '@'('a'|'d'|'e'|'c'|'>'|'$'|'h'|'s'|'0')
            );
      

FACTORIAL        : '&';  //Dots 12346,  no. 26
GENERAL_OMISSION : '=';  //Dots 123456, no. 27
LGRP             : '(';  //Dots 12356,  no. 28
                         //See below for no. 29, integrals
RGRP             : ')';  //Dots 23456,  no. 30

        
fragment PLUS:   '+';   //Dots 346, no. 52
fragment MINUS:  '-';   //Dots 36,  no. 56
fragment BSLASH: '\\'; 
fragment ASTER:  '*';   //Dots 16,  no. 31
BINOP    : PLUS
         | MINUS
         | PLUS DOT5 MINUS
         ;

BINOP_PREC:
         '@'? ASTER // times cross, times dot
         | './'     //old-fash. div. sign 
         ;

  //Decimal digits with optional leading N.I.
INT      : ('#')?[0-9]+; //Lower digits, nos. 41-50

CMPR     : (' .k'|' .K');

  //Subscript and superscript indicators
SUBSUB   : ';;';
SUBSUP   : ';^';
SUB      : ';';    //Dots 56, no. 62
SUPSUB   : '^;';
SUPSUP   : '^^';
SUP      : '^';    //Dots 45, no. 58

  //Overscript and underscript indicators
MODIF    : DOT5;
//BASELINE : DOT5;
fragment DOT5: '"';
MODOVER  : '<';   //Dots 126, no. 32
MODUNDER : '%';   //Dots 146. no. 33
TERM     : ']';   //Dots 12456, no. 37

  //Fraction indicators
SFRAC      : '?';   //Dots 1456, no. 34
FRAC_SLASH : '_'?'/';
ESFRAC     : '#';   //Dots 3456, no. 53
CFRAC      : ',?';  
CSLASH     : ',''_'?'/';
ECFRAC     : ',#';   
HCFRAC     : ',,?';  
HCSLASH    : ',,''_'?'/';
EHCFRAC    : ',,#'; 
SMIXFR     : '_?';
EMIXFR     : '_#';

  //Radical indicators
SQRT       : '>';
SQRT1      : '.>';
SQRT2      : '..>';
SQRT3      : '...>';
//IRAD       : '<';  //Same as MODOVER
IRAD1      : '.<';
IRAD2      : '..<';
IRAD3      : '...<';
//Same outer terminator as for other uses
RTRM1      : '.]';
RTRM2      : '..]';
RTRM3      : '...]';






SPACE    : ' ';
NEWLINE  : [\r\n]+;

INFINITY : ',=';

INTEGRAL:               //Dots 2346,   no. 29
          '!'           //Single integral
           (('!')+      //Multiple integrals
           |'@'('$'('c' //Integral with sup. circle
                   |'r' //Integral with sup. rectangle
                   |'4' //Integral with sup. square
                   )
               |',''='  //Integral with sup. infinity
               )
            ']'
           )?
           ;

 

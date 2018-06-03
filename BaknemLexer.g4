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

NOTHING: 'NoThInG';
//START_NEM  : '_' DOTS146 ' ' -> skip, pushMode( NEMETH );
//mode NEMETH;

BLURB: '<h3>' .*? '</h3>';
                                             
    // ==Cells no. 1-25, 40 ['w']==

 // 2 or more small letters, possible function abbr.
 // or var &InvisibleTimes; function abbr.
LC_ID :  ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z')+
         {  if (isFunAbbr( getText() )){
             setType( BaknemParser.FUN_ABBR );
            } else if (isTrailFA( getText() )){ 
             setType( BaknemParser.TRAIL_FUN_ABBR );
            }
         }; 

//<lim (Upper Limit( and %lim (Lower Limit( are special cases
LIMS:  ('a'..'z'|'A'..'Z')*('<'|'%')'lim'
       {    if (isFunAbbr( getText() )){
             setType( BaknemParser.FUN_ABBR );
            } else if (isTrailFA( getText() )){ 
             setType( BaknemParser.TRAIL_FUN_ABBR );
            }
       }; 

//Parser can't resolve Chemical Symbols perfectly
//Need a CHEMISTRY mode and a switch
 //Single cap or single small letter with optional italics
 // or bold typeform; a plain single cap poss. chem. el.
ID    : ('_;'|'.;')?(DOT6)?('a'..'z'|'A'..'Z')
         {if (isChemicalSymbol( getText() )){
           setType( BaknemParser.POSS_CH_ELEMENT);
         }
        };

  //Single cap followed by single small, likely chem. el. symbol
MIXID : (DOT6)('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z')
         {if (isChemicalSymbol( getText() )){
           setType( BaknemParser.CHEM_ELEMENT);
         }
        };

fragment ROMAN_NUMERALS: ('i'|'v'|'x'|'l'|'c'|'d'|'m'
                         |'I'|'V'|'X'|'L'|'C'|'D'|'M'
                         )
                         ;

CAP_ROMAN_NUM_SEQ: DOT6 DOT6 
                   ROMAN_NUMERALS ROMAN_NUMERALS (ROMAN_NUMERALS)*
                   ;

UC_ID :  DOT6 DOT6 ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z')+;

GREEK_LETTER: ('_'|DOTS46)?DOTS46 DOT6? GREEK_LETTERs;

MISCALPHD4  : ('@,'('a'|'r'|'p'|'s')
            | '@'('a'|'d'|'e'|'c'|'>'|'$'|'h'|'s'|'0')
            );

  //Punc. Ind. followed by a literary punc. mark
  //            apostrophe, colon, period, 
  //            semicolon, exclamation, question
  //            outer and inner right quotes 
fragment USCORE: '_';
fragment APOS:   '\'';
fragment DOT6:   ',';
fragment DOTS156: ':'; // no. 34 ==

PI_PUNC: USCORE(APOS|'3'|'4'
               |'2'|'6'|'8'|'0'(APOS)?
               );
 // left quotes
PRE_PUNC:   (DOT6)?'8';
 // long dash, short dash; ellipsis
 //TO_DO hyphen is problem because of minus!
MISC_PUNC: 	('---'|'-')'-' |APOS APOS APOS  ;

FACTORIAL        : '&';  //Dots 12346,  no. 26 ==
GENERAL_OMISSION : '=';  //Dots 123456, no. 27 ==
LGRP             : '(';  //Dots 12356,  no. 28 ==
                         //See below for no. 29, integrals
ENLGRP           : ('@')?',(';
RGRP             : ')';  //Dots 23456,  no. 30 ==
ENRGRP           : ('@')?',)';
      
fragment PLUS:   '+';   //Dots 346, no. 52
fragment MINUS:  '-';   //Dots 36,  no. 56
fragment BSLASH: '\\';  //DOTS1256, no. 38 ==
fragment ASTER:  '*';   //Dots 16,  no. 31 ==
BINOP    : PLUS
         | MINUS
         | PLUS DOT5 MINUS
         ;

//Operators with precedence over above
BINOP_PREC:
         '@'? ASTER // times cross, times dot
         | './'     // old-fash. div. sign 
         ;

fragment DEC_DIG: [0-9]; fragment DOTS46: '.';

  //Decimal digits with optional leading N.I.
 //Lower digits, nos. 41-50  ==
 //2.p is print 2PI not 2.p; print 2.PI is brl 2.".p

INT      : ('_#'|'.#'|'#')? DEC_DIG+
           (  DOTS46 DOTS46? DOT6? GREEK_LETTERs
               {setType( BaknemParser.INTxGREEK);}
           )?
         ;     
 //2.p is print 2PI not 2.p
REAL     : ('_#'|'.#'|'#')?
           ( DEC_DIG+ DOTS46 (DOT5
                             |DEC_DIG
                             )?
           | (DOTS46 DEC_DIG+) 
           )   
          ; 

CMPR     : (' ')('/')?('.k'|'.K');

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
fragment DOTS146: '%';
MODOVER  : '<';     //Dots 126, no. 32  ==
MODUNDER : DOTS146; //Dots 146. no. 33  ==
TERM     : ']';     //Dots 12456, no. 37

  //Fraction indicators
SFRAC      : '?';   //Dots 1456, no. 34 ==
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

ARROW    : '$'(('--')? ('o'|'O') //Rt. DOTS 1246, no. 36
         |     ('[--')           //Left
         |     ('[--'('o'|'O'))  //R&L
         |     ('<--'('o'|'O'))  //Up
         |     ('%--'('o'|'O'))  //Down
         |     ('[--'('o'|'O'))  //Up & down
              );
      
SPACE    : ' ';
NEWLINE  : [\r\n]+;

INFINITY : ',=';

INTEGRAL:               //Dots 2346,   no. 29
          '!'           //Single integral
           (('!')+      //Multiple integrals
           |'@'('$'('c' //Int. w/ sup. circle (contour int.)
                   |'r' //Int. w/ sup. rectangle
                   |'4' //Int. w/ sup. square
                   )
               |',''='  //Int. w/ sup. infinity
               )
            ']'
           )?
           ;

mode CHEMISTRY;
  //Single cap followed by single small, likely chem. el. symbol
CHEM_ELEMENT : (DOT6)('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z')
         {if (!isChemicalSymbol( getText() )){
           setType( MIXID );
          }
        } ;
POSS_CH_ELEMENT   : (DOT6)('a'..'z'|'A'..'Z')
         {if (!isChemicalSymbol( getText() )){
           setType( ID );
         }
        };
CHM_ARROW  : '$'( ('--')? ('o'|'O') //Rt.
                | ('[--')           //Left
                | ('[--'('o'|'O'))  //R&L
                | ('<--'('o'|'O'))  //Up
         |    ('%--'('o'|'O'))  //Down
         |     ('[--'('o'|'O'))  //Up & down
              );


parser grammar BaknemParser;
options { tokenVocab = BaknemLexer; }
@parser::header {   
 package nem;
}

tokens { LATIN_LETTER, FUN_ABBR, FUNCTION_NAME, TRAIL_FUN_ABBR,
         LC_ROMAN_NUM_SEQ, //CHEM_ELEMENT, POSS_CH_ELEMENT,
         SUPER_SUP, SUPER_SUB, INTxGREEK,  
         SUPER_SUP_SUB, SUPER_SUB_SUB,SUPER_SUP_SUP, SUPER_SUB_SUP,
         HOLLOW_DOT, BFPLUS, PLUS_MINUS, BFMINUS, MINUS_PLUS} 
      

prog  : stat+;
stat  : space* exprs (space+ exprs)* space* NEWLINE     
      | NEWLINE 
      //| header3 NEWLINE 
      ;

header3: BLURB;

  //Nemeth CodeBook Sec. 119
funWithArg  : (MODIF funabb ((MODUNDER|MODOVER)endmod)
              |(funabb | varXfunabb)  ( SUB script
                       | SUP script
                       )? 
              )(space layexpr);

space : SPACE;
postpunc: PI_PUNC;
exprs : ( layexpr )postpunc?;

expr  : lgrp expr rgrp
      | expr expr 
      | expr binop1 expr    
      | expr binop expr    
      | expr cmpr (expr)? 
      | cmpr
      | numsub | chnumsub 
      | var|specsym
      | number
      | chelement
      | chformula
      ;


layexpr: 
     layexpr layexpr   //invisible times 
     | lgrp layexpr rgrp
     | layexpr binop1 layexpr    
     | layexpr binop layexpr
     | layexpr cmpr (layexpr)?
     | mfrac | mmfrac | mmmfrac
     | munder | mover | mundov
     | mscript
     | sqrt| irad
     | expr
     |funWithArg
     | func
     ;

  //1st inner radical allowed in outer
nor  : lgrp nor rgrp
     | nor nor     //invisible times
     | nor binop1 nor    
     | nor binop nor
     //| nor cmpr nor
     | mfrac | mmfrac | mmmfrac
     | munder | mover | mundov
     | mscript
     | irad1|sqrt1
     | expr
     | func
     ;

   //2nd inner radical allowed in 1st inner
nor1 : lgrp nor1 rgrp
     | nor1 nor1    //invisible times
     | nor1 binop1 nor1    
     | nor1 binop nor1
     //| nor cmpr nor
     | mfrac | mmfrac | mmmfrac
     | munder | mover | mundov
     | mscript
     | irad2|sqrt2
     | expr
     | func
     ;

   //3rd inner radical allowed in 2nd inner
nor2 : lgrp nor2 rgrp
     | nor2 nor2    //invisible times
     | nor2 binop1 nor2    
     | nor2 binop nor2
     //| nor cmpr nor
     | mfrac | mmfrac | mmmfrac
     | munder | mover | mundov
     | mscript
     | irad3|sqrt3
     | expr
     | func
     ;

  //no inner radicals allowed in 3rd inner or index
nor3 : lgrp nor3 rgrp
     | nor3 nor3   //invisible times
     | nor3 binop1 nor3    
     | nor3 binop nor3
     //| nor cmpr nor
     | mfrac | mmfrac | mmmfrac
     | munder | mover | mundov
     | mscript
     | expr
     | func
     ;

 //expressions used in sub, sup, subsup
 // no mscript
nom  : lgrp nom rgrp
     | nom nom
     | nom binop1 nom
     | nom binop nom
     | nom cmpr nom
     | mfrac | mmfrac | mmmfrac
     | munder | mover | mundov
     | expr
     | funWithArg
     | sqrt | irad 
     ;

  //no fractions in simple fraction
nof  : lgrp nof rgrp
     | nof nof
     | nof binop1 nof
     | nof binop nof
     | nof cmpr nof
     | munder | mover | mundov
     | mscript
     | expr
     | funWithArg
     | func
     | sqrt | irad
     ;

 //only simple fractions in complex fraction
nofc : lgrp nofc rgrp
     | nofc nofc
     | nofc binop1 nof
     | nofc binop nofc
     | nofc cmpr nofc
     | munder | mover | mundov
     | mscript
     | expr
     | func
     | mfrac
     | sqrt | irad 
     ;

 //no hypercomplex fractions in itself
nofch : lgrp nofch rgrp
      | nofch nofch
      | nofch binop1 nofch
      | nofch binop nofch
      | nofch cmpr nofch
      | munder | mover | mundov
      | mscript
      | expr
      | func
      | mfrac|mmfrac
      | sqrt | irad 
     ;

mfrac:   SFRAC nof FRAC_SLASH nof ESFRAC;
mmfrac:  CFRAC nofc    CSLASH nofc ECFRAC;
mmmfrac: HCFRAC nofch HCSLASH nofch EHCFRAC;

rindex  :   nor3;
sqrt    :   SQRT nor TERM;
irad    :   MODOVER rindex SQRT nor TERM;
  //Inner radicals are nested, never stand alone
  //Note per Rule 165 inner indexed rads use default sqrt
sqrt1   :   SQRT1 nor1 RTRM1;
irad1   :   IRAD1 rindex SQRT nor1 RTRM1;
sqrt2   :   SQRT2 nor2 RTRM2;
irad2   :   IRAD2 rindex SQRT nor2 RTRM2;
sqrt3   :   SQRT3 nor3 RTRM3;
irad3   :   IRAD3 rindex SQRT nor3 RTRM3;

 //All the items that can be modified or be
 //modifiers
nomod  : lgrp nomod rgrp
     | nomod nomod    //invisible times
     | nomod binop1 nomod
     | nomod binop nomod
     | cmpr
     | nomod cmpr nomod
     | mfrac | mmfrac | mmmfrac
     | mscript
     | irad|sqrt
     | expr
     ;

//Under and overscripts, TO_DO also can be higher order!
begmod: nomod;
munder: MODIF begmod MODUNDER endmod TERM;
mover:  MODIF begmod MODOVER  endmod TERM;
mundov: MODIF begmod MODUNDER endmod MODOVER endmod TERM;
endmod: nomod;

varXfunabb: TRAIL_FUN_ABBR;
funabb: FUN_ABBR;
//funabbs: funabb | varXfunabb;

        
func  : (MODIF funabb ((MODUNDER|MODOVER)endmod TERM)
        |(funabb | varXfunabb) ( SUB script
                               | SUP script
                               )? 
        )  //(space layexpr )?
        ;
        
lgrp    : LGRP;
rgrp    : RGRP;
binop   : BINOP;
binop1  : BINOP_PREC|FRAC_SLASH ; //mult. and div. bind 1at
cmpr    : (CMPR| space ARROW)(space layexpr)?;
singleLet: ID|POSS_CH_ELEMENT;
var     : singleLet+|LC_ID|UC_ID|MIXID|greeks;
greeks  : (GREEK_LETTER)+;
specsym : INTEGRAL | INFINITY | MISCALPHD4 ;

number     : INT (INT)*| (INT)*REAL(INT)*|INTxGREEK;
numsub     : (var|funabb) number;
chelement  : CHEM_ELEMENT|POSS_CH_ELEMENT;
chnumsub   : chelement number;
chradical  : '(' (chelement | chnumsub)+ ')' SUB number;
chformula  :  chnumsub 
             | ( chelement | chnumsub | chradical )
               ( chelement | chnumsub | chradical )+;

sup2    : (SUPSUP) script;
sup2b   : (SUPSUB) script;
sup22   : (SUPSUB) script (SUPSUP) script;
sub2    : (SUBSUB) script;
sub2p   : (SUBSUP) script;
sub22   : (SUBSUB) script (SUBSUP) script;
//base    : (var|number|expr); 
base: nom;
script  : nom;
subscript: SUB script;
supscript: SUP script;
msub    : base SUB script (sub2|sub2p|sub22)? MODIF? ;
msup    : base SUP script (sup2|sup2b|sup22)? MODIF? ;
msubsup : base subscript supscript MODIF? ;
mscript : msub | msup | msubsup;



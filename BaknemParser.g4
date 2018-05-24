parser grammar BaknemParser;
options { tokenVocab = BaknemLexer; }
@parser::header {   
 package nem;
}

tokens { LATIN_LETTER, FUN_ABBR, FUNCTION_NAME, LC_ROMAN_NUM_SEQ, 
         UC_ID, CHEM_ELEMENT, POSS_CH_ELEMENT,
         SUPER_SUP, SUPER_SUB,   
         SUPER_SUP_SUB, SUPER_SUB_SUB,SUPER_SUP_SUP, SUPER_SUB_SUP,
         HOLLOW_DOT, BFPLUS, PLUS_MINUS, BFMINUS, MINUS_PLUS} 
      

prog  : stat+;
stat  : space* exprs (space+ exprs)* space* NEWLINE     
      | NEWLINE  
      ;

space : SPACE;
exprs : (layexpr);

expr  : lgrp expr rgrp
      | expr binop expr    
      | expr cmpr expr  
      | var
      | integer
      | numsub | chnumsub
      | chelement
      | chformula
      ;


layexpr: lgrp layexpr rgrp
     | layexpr binop layexpr
     | layexpr cmpr layexpr
     | layexpr layexpr   //invisible times
     | mfrac | mmfrac | mmmfrac
     | munder | mover | mundov
     | mscript
     | sqrt| irad
     | expr
     | func
     ;

  //1st inner radical allowed in outer
nor  : lgrp nor rgrp
     | nor binop nor
     | nor nor     //invisible times
     //| nor cmpr nor
     | mfrac | mmfrac | mmmfrac
     | munder | mover | mundov
     | mscript
     | irad1|sqrt1
     | expr
     | func
     ;

   //2nd inner radical allowed in 1st inner
nor1  : lgrp nor1 rgrp
     | nor1 binop nor1
     | nor1 nor1    //invisible times
     //| nor cmpr nor
     | mfrac | mmfrac | mmmfrac
     | munder | mover | mundov
     | mscript
     | irad2|sqrt2
     | expr
     | func
     ;

   //3rd inner radical allowed in 2nd inner
nor2  : lgrp nor2 rgrp
     | nor2 binop nor2
     | nor2 nor2    //invisible times
     //| nor cmpr nor
     | mfrac | mmfrac | mmmfrac
     | munder | mover | mundov
     | mscript
     | irad3|sqrt3
     | expr
     | func
     ;

  //no inner radicals allowed in 3rd inner
nor3  : lgrp nor3 rgrp
     | nor3 binop nor3
     | nor3 nor3   //invisible times
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
     | nom binop nom
     | nom cmpr nom
     | mfrac | mmfrac | mmmfrac
     | munder | mover | mundov
     | expr
     | func
     | sqrt | irad 
     ;

  //no fractions in simple fraction
nof  : lgrp nof rgrp
     | nof binop nof
     | nof cmpr nof
     | munder | mover | mundov

     | mscript
     | expr
     | func
     | sqrt | irad
     ;

 //only simple fractions in complex fraction
nofc  : lgrp nofc rgrp
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
nofch  : lgrp nofch rgrp
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

rindex  :   nor;
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

nomod  : lgrp nomod rgrp
     | nomod binop nomod
     | nomod nomod    //invisible times
     | nomod cmpr nomod
     | mfrac | mmfrac | mmmfrac
     | mscript
     | irad|sqrt
     | expr
     | func
     ;

//Under and overscripts, TO_DO also can be higher order!
begmod: nomod;
munder: MODIF begmod MODUNDER endmod TERM;
mover:  MODIF begmod MODOVER  endmod TERM;
mundov: MODIF begmod MODUNDER endmod MODOVER endmod TERM;
endmod: nomod;

funabb: FUN_ABBR;
  //Nemeth CB Sec. 119
func  : (MODIF funabb ((MODUNDER|MODOVER)endmod)
        |funabb (SUB script
                |SUP script
                )? 
        )
        space expr;

lgrp    : LGRP;
rgrp    : RGRP;
binop   : BINOP;
cmpr    : CMPR;
var     : ID|LC_ID|MIXID;

integer : INT;
numsub  : (var|funabb) integer;
chelement  : CHEM_ELEMENT|POSS_CH_ELEMENT;
chnumsub   : chelement integer;
chradical  : '(' (chelement | chnumsub)+ ')' SUB integer;
chformula  : (chelement | chnumsub | chradical)+;

sup2    : (SUPSUP) script;
sup2b   : (SUPSUB) script;
sup22   : (SUPSUB) script (SUPSUP) script;
sub2    : (SUBSUB) script;
sub2p   : (SUBSUP) script;
sub22   : (SUBSUB) script (SUBSUP) script;
//base    : (var|integer|expr); 
base: nom;
script  : nom;
supscript: SUP script;
msub    : base SUB script (sub2|sub2p|sub22)? MODIF? ;
msup    : base SUP script (sup2|sup2b|sup22)? MODIF? ;
msubsup : msub supscript MODIF? ;
mscript : msub | msup | msubsup;



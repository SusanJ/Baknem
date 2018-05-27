package nemdata;
import java.util.HashMap;

/**Identifies and back-translates 
   reserved words (literals)
   used as function names or
   as function name abbreviations according
   to Rule XVII. 
*/
public class FunctionName {

 static final FunctionName [] functionTable = {
  new FunctionName ("amplitude", "amplitude"), 
  new FunctionName ("antilogarithm", "antilogarithm"),
  //new FunctionName ("arc", "arc"),
  new FunctionName ("argument", "argument"),
  new FunctionName ("cologarithm", "cologarithm"),
  new FunctionName ("cosine", "cosine"),
  new FunctionName ("hyperbolic", "hyperbolic"),
  new FunctionName ("hyperbolic cosine", "hyperbolic cosine"),
  new FunctionName ("cotangent", "cotangent"),
  new FunctionName ("hyperbolic cotangent", "hyperbolic cotangent"),
  new FunctionName ("coversine", "coversine" ),
  new FunctionName ("cosecant", "cosecant" ),
  new FunctionName ("hyperbolic cosecant", "hyperbolic cosecant" ),
  new FunctionName ("cotangent", "cotangent" ),
  new FunctionName ("hyperbolic cotangent", "hyperbolic cotangent" ),
  new FunctionName ("determinant", "imaginary"),
  new FunctionName ("error function", "error function"),
  new FunctionName ("exponential", "exponential"),
  new FunctionName ("exsecant", "exsecanty"),
  new FunctionName ("gradient", "gradient" ),
  new FunctionName ("haversine", "haversine" ),
  //new FunctionName ("imaginary", "imaginary"),
 //new FunctionName ("part", "part"),
  new FunctionName ("imaginary part", "imaginary part"),
  new FunctionName ("infinum", "infinum" ),
  new FunctionName ("limit", "limit" ),
  new FunctionName ("upper limit", "upper limit" ),
  new FunctionName ("lower limit", "lower limit" ),
  new FunctionName ("natural logarithm", "naturallogarithm"),
  new FunctionName ("logarithm", "logarithm"),
  new FunctionName ("maximum", "maximum"),
  new FunctionName ("minimum", "minimum"),
  new FunctionName ("modulo", "modulo"),
  new FunctionName ("real part", "real part" ),
  new FunctionName ("secant", "secant" ),
  new FunctionName ("hyperbolic secant", "hyperbolic secan" ),
  new FunctionName ("sine", "sine"), 
  new FunctionName ("hyperbolic sine", "hyperbolic sine"), 
  new FunctionName ("supremum", "supremum" ),
  new FunctionName ("tangent", "tangent" ),
  new FunctionName ("hyperbolic tangent", "hyperbolic tangent" ),
  new FunctionName ("versine", "versine" ),
 };
 static final FunctionName [] funAbbrTable = {

  new FunctionName ("amp",     "amp"), 
  new FunctionName ("antilog", "antilog"),
  new FunctionName ("arc",     "arc"),
  new FunctionName ("arc cos", "arccos"),
  new FunctionName ("arccos",  "arccos"),
  new FunctionName ("arc sin", "arcsin"),
  new FunctionName ("arcsin",  "arcsin"),
  new FunctionName ("arg",     "arg"),
  new FunctionName ("colog",   "colog"),
  new FunctionName ("cos",     "cos"),
  new FunctionName ("cosh",    "cosh"),
  new FunctionName ("cot",     "cot"),
  new FunctionName ("coth",    "coth"),
  new FunctionName ("covers",  "covers"),
  new FunctionName ("csc",     "csc"),
  new FunctionName ("csch",    "csch"),
  new FunctionName ("ctn",     "ctn"),
  new FunctionName ("ctnh",    "ctnh"),
  new FunctionName ("det",     "det"),
  new FunctionName ("erf",     "erf"),
  new FunctionName ("exp",     "exp"),
  new FunctionName ("exsec",   "exsec"),
  new FunctionName ("grad",    "grad"),
  new FunctionName ("hav",     "hav"),
  new FunctionName ("im",      "im"),
  new FunctionName ("inf",     "inf"),
  new FunctionName ("lim",     "lim"),
  new FunctionName ("<lim",    "upper_lim"),
  new FunctionName ("%lim",    "lower_lim"),
  new FunctionName ("ln",      "ln"),
  new FunctionName ("log",     "log"),
  new FunctionName ("max",     "max"),
  new FunctionName ("min",     "min"),
  new FunctionName ("mod",     "mod"),
  new FunctionName ("re",      "re"),
  new FunctionName ("sec",     "sec"),
  new FunctionName ("sech",    "sech"),
  new FunctionName ("sin",     "sin"),
  new FunctionName ("sinh",    "sinh"),
  new FunctionName ("sup",     "sup"),
  new FunctionName ("tan",     "tan"),
  new FunctionName ("tanh",    "tanh"),
  new FunctionName ("vers",    "vers")
};

 static final HashMap <String, String> funNames2Ink = 
          new HashMap <String, String>();
 static final HashMap <String, String> funNames2Brl = 
          new HashMap <String, String>();
 static final HashMap <String, String> funAbbrs2Ink = 
          new HashMap <String, String>();
 static final HashMap <String, String> funAbbrs2Brl = 
          new HashMap <String, String>();
 
 static boolean tablesDone = makeTables();

 String brl;
 String ink;

FunctionName( String brl, String ink ){
 this.brl = brl;
 this.ink = ink;
}
String getBrl(){ return brl; }
String getInk(){ return ink; }
//---------------------------------------------------------------
/**Determine if an ASCII braille string is a function name.
*/
public static boolean isBrlFunName( String aBrl ){
 //log.trace ("isFunctionName? "+aBrl.toLowerCase());
 return funNames2Ink.containsKey (aBrl.toLowerCase());
}
//---------------------------------------------------------------
/**Determine if an ASCII braille string is a function name
   abbreviation.
*/
public static boolean isBrlFunAbbr( String aBrl ){
 //log.trace ("isFunAbbr? "+aBrl.toLowerCase());
 return funAbbrs2Ink.containsKey( aBrl.toLowerCase() );
}
//---------------------------------------------------------------
/**Returns the print translation of a braille function name or
   null otherwise.  
   (Does not make any error checks.)
*/
public static String transBrlFunName( String aBrl ){
 return funNames2Ink.get( aBrl.toLowerCase() );
}
//---------------------------------------------------------------
/**Returns the print translation of a braille function 
   name abbreviation or null otherwise.  
   (Does not make any error checks.)
*/
public static String transBrlFunAbbr( String aBrl ){
 return funAbbrs2Ink.get( aBrl.toLowerCase() );
}
static boolean makeTables(){
 if (tablesDone) return true;
 for (int i=0; i<functionTable.length; i++){
  String brl = functionTable[i].getBrl(); 
  String ink = functionTable[i].getInk(); 
  funNames2Ink.put( brl, ink );
  funNames2Brl.put( ink, brl );
 }
 for (int i=0; i<funAbbrTable.length; i++){
  String brl = funAbbrTable[i].getBrl(); 
  String ink = funAbbrTable[i].getInk(); 
  funAbbrs2Ink.put( brl, ink );
  funAbbrs2Brl.put( ink, brl );
 }
 return true;
}
/**Reports if a string ends with a braille function abbreviation.
   Seems to be only way to recognize "invisible times" expression 
   where the factor before the function is a lower case
   identifier, e.g. xsin y.  (The only relevant example is 
   Rule 119 c(4) where there is a single number preceding and
   unspaced from the function name abbr.

   @return 0 if string does not end with abbreviation,
           otherwise the number of characters in
           the (longest) abbreviation., 
           e.g. cosec rather than sec.          
*/
static int endsWithFunAbbr( String seq ){

 if (seq.length() < 3) return 0;
 String test = seq.toLowerCase();
 int len = 0;
 for (int i=0; i<funAbbrTable.length; i++){ 
  if (test.endsWith( funAbbrTable[i].getBrl() )){
    if (funAbbrTable[i].getBrl().length() > len ){ 
     len = funAbbrTable[i].getBrl().length();
    }
  }
 }
 return len;
}
public static boolean trailingFunAbbr( String seq ){
 int len = endsWithFunAbbr( seq );
 if (len == 0) return false;
 if (len == seq.length() ) return false;
 return true; 
}
}//End Class FunctionTable.
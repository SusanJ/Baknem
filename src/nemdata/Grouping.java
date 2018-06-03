package nemdata;
import java.util.HashMap;
public class Grouping{

static final Grouping [] pairTable = {
  new Grouping( ")",      "(" , 0),       //Normal parentheses
  new Grouping( "@)",     "@(" , 0 ),      //Normal square brackets
  new Grouping( "_@)",    "_@(" , 0 ),     //Boldface square brackets
  new Grouping( ".)",     ".(" , 0 ),      //Normal curly brackets
  new Grouping( "\\",     "\\" , 0  ),      //Single vertical bar
  new Grouping( "\\\\",   "\\\\" , 0 ),  //Double vertical bar
  new Grouping( "_\\",    "_\\" , 0  ),  //Bold single vertical bar
  new Grouping( "_\\_\\", "_\\_\\" , 0 ),  //Bold double vertical bar
  new Grouping( "..)",    "..(" , 0 ),     //Angle brackets
  new Grouping( "@_)",    "@_(" , 0 ),     //Barred brackets
  new Grouping( "._)",    "._(" , 0 ),     //Barred braces
  new Grouping( "@^)",    "@^(" , 0 ),     //Upper half brackets
  new Grouping( "@;)",    "@;(" , 0),     //Lower half brackets
  new Grouping( ",'",     ",'"  , 0),      //Transcriber's grp.syms.
 };

 static final Grouping [] lgrpTransTable = {
  new Grouping( "(",      "(" ),     //Normal parentheses
  new Grouping( "@(",     "[" ),     //Normal square brackets
  //new Grouping( "_@)",    "_@(" ),    //Boldface square brackets
  new Grouping( ".(",     "{" ),     //Normal curly brackets
  new Grouping( "\\",     "|" ),     //Single vertical bar
  new Grouping( "\\\\",   "||"   ),  //Double vertical bar
  //new Grouping( "_\\",    "_\\"    ), //Boldface single vertical bar
  //new Grouping( "_\\_\\", "_\\_\\" ), //Boldface double vertical bar
  new Grouping( "..{",    "&lt;" ),  //Angle brackets
  //new Grouping( "@_(",    "@_(" ),   //Barred brackets
  //new Grouping( "._(",    "._(" ),   //Barred braces
  //new Grouping( "@^(",    "@^(" ),   //Upper half brackets
  //new Grouping( "@;(",    "@;(" ),   //Lower half brackets
  new Grouping( ",'",     "TN" ),    //Transcriber's grouping symbols
 };
 static final Grouping [] rgrpTransTable = {
  new Grouping( ")",      ")" ),     //Normal parentheses
  new Grouping( "@)",     "]" ),     //Normal square brackets
  //new Grouping( "_@)",    "_@)" ),    //Boldface square brackets
  new Grouping( ".)",     "}" ),     //Normal curly brackets
  new Grouping( "\\",     "|" ),     //Single vertical bar
  new Grouping( "\\\\",   "||"   ),  //Double vertical bar
  //new Grouping( "_\\",    "_\\"    ), //Boldface single vertical bar
  //new Grouping( "_\\_\\", "_\\_\\" ), //Boldface double vertical bar
  new Grouping( "..)",    "&gt;" ),  //Angle brackets
  //new Grouping( "@_)",    "@_)" ),   //Barred brackets
  //new Grouping( "._)",    "._)" ),   //Barred braces
  //new Grouping( "@^)",    "@^)" ),   //Upper half brackets
  //new Grouping( "@;)",    "@;)" ),   //Lower half brackets
  new Grouping( ",'",     "TN" ),    //Transcriber's grouping symbols
 };

 static HashMap<String,String> pairRt2Left = 
  new HashMap<String,String>();
 static HashMap<String,Grouping> leftGroup =
    new HashMap<String,Grouping>();
 static HashMap<String,Grouping> rightGroup =
    new HashMap<String,Grouping>();
 public static boolean done = makeLeftAndRight();

 String brl; //Or right grp. in pairs table
 String ink; //Or matching left grp. in pairs table
 boolean pair = false;

 Grouping( String brl, String ink ){
  this.brl = brl;
  this.ink = ink;
 }
 //This is a hack, should be a different class!
 Grouping( String right, String left, int flag){
  this.brl = right;
  this.ink = left;
  this.pair = true;
 }
 String getBrl(){ return brl;}
 String getInk(){ return ink;}
 String getLeft(){
  if (pair) return ink;
  return null;
 }
 public static boolean makeLeftAndRight(){
  if (done) return true;
  Grouping g;
  for (int i=0; i<lgrpTransTable.length; i++){
   g = lgrpTransTable[i];
   leftGroup.put( g.getBrl(), g );
  }
  for (int i=0; i<rgrpTransTable.length; i++){
   g = rgrpTransTable[i];
   rightGroup.put( g.getBrl(), g );
  }
  return true;
 }
 public static String backTransLgrp( String brl ){
  Grouping g = leftGroup.get( brl );
  if (g == null) return null;
  return g.getInk();
 } 
 public static String backTransRgrp( String brl ){
  Grouping g = rightGroup.get( brl );
  if (g == null) return null;
  return g.getInk();
 } 
 public static String backTransAnyGrp( String brl ){
  String ink = backTransLgrp( brl );
  if (ink != null) return ink;
  return backTransRgrp( brl );
 }
}//End Class Grouping.
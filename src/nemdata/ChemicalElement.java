package nemdata;
//import baknemshared.MyLogger;
import java.util.HashMap;
/**<p>Identifies the braille symbols used for
   the chemical elements. </p>
*/
public final class ChemicalElement {

 //static final boolean trace = true;
 //static MyLogger log = new MyLogger(trace, "ChemicalElements--");
 //static boolean stopOnError = true;


/**Based on information obtained from wikipedia:
   http://en.wikipedia.org/wiki/List_of_elements_by_name
   "As of August 2017, 118 chemical elements are identified."
   TO-DO Add 114-118
*/
 
 static int currElements = 118;
 static final ChemicalElement [] elementTable = {
  new ChemicalElement ( ",ac", "Actinium"      ), // Atomic number: 89
  new ChemicalElement ( ",al", "Aluminum"      ), // Atomic number: 13
  new ChemicalElement ( ",am", "Americium"     ), // Atomic number: 95
  new ChemicalElement ( ",sb", "Antimony"      ), // Atomic number: 51
  new ChemicalElement ( ",ar", "Argon"         ), // Atomic number: 18
  new ChemicalElement ( ",as", "Arsenic"       ), // Atomic number: 33
  new ChemicalElement ( ",at", "Astatine"      ), // Atomic number: 85
  new ChemicalElement ( ",ba", "Barium"        ), // Atomic number: 56
  new ChemicalElement ( ",bk", "Berkelium"     ), // Atomic number: 97
  new ChemicalElement ( ",be", "Beryllium"     ), // Atomic number: 4
  new ChemicalElement ( ",bi", "Bismuth"       ), // Atomic number: 83
  new ChemicalElement ( ",bh", "Bohrium"       ), // Atomic number: 107
  new ChemicalElement ( ",b",  "Boron"         ), // Atomic number: 5
  new ChemicalElement ( ",br", "Bromine"       ), // Atomic number: 35
  new ChemicalElement ( ",cd", "Cadmium"       ), // Atomic number: 48
  new ChemicalElement ( ",cs", "Cesium"        ), // Atomic number: 55
  new ChemicalElement ( ",ca", "Calcium"       ), // Atomic number: 20
  new ChemicalElement ( ",cf", "Californium"   ), // Atomic number: 98
  new ChemicalElement ( ",c",  "Carbon"        ), // Atomic number: 6
  new ChemicalElement ( ",ce", "Cerium"        ), // Atomic number: 58
  new ChemicalElement ( ",cl", "Chlorine"      ), // Atomic number: 17
  new ChemicalElement ( ",cr", "Chromium"      ), // Atomic number: 24
  new ChemicalElement ( ",co", "Cobalt"        ), // Atomic number: 27
  new ChemicalElement ( ",cn", "Copernicium"   ), // Atomic number: 112
  new ChemicalElement ( ",cu", "Copper"        ), // Atomic number: 29
  new ChemicalElement ( ",cm", "Curium"        ), // Atomic number: 96
  new ChemicalElement ( ",ds", "Darmstadtium"  ), // Atomic number: 110
  new ChemicalElement ( ",db", "Dubnium"       ), // Atomic number: 105
  new ChemicalElement ( ",dy", "Dysprosium"    ), // Atomic number: 66
  new ChemicalElement ( ",es", "Einsteinium"   ), // Atomic number: 99
  new ChemicalElement ( ",er", "Erbium"        ), // Atomic number: 68
  new ChemicalElement ( ",eu", "Europium"      ), // Atomic number: 63
  new ChemicalElement ( ",fm", "Fermium"       ), // Atomic number: 100
  new ChemicalElement ( ",f",  "Fluorine"      ), // Atomic number: 9
  new ChemicalElement ( ",fr", "Francium"      ), // Atomic number: 87
  new ChemicalElement ( ",gd", "Gadolinium"    ), // Atomic number: 64
  new ChemicalElement ( ",ga", "Gallium"       ), // Atomic number: 31
  new ChemicalElement ( ",ge", "Germanium"     ), // Atomic number: 32
  new ChemicalElement ( ",au", "Gold"          ), // Atomic number: 79
  new ChemicalElement ( ",hf", "Hafnium"       ), // Atomic number: 72
  new ChemicalElement ( ",hs", "Hassium"       ), // Atomic number: 108
  new ChemicalElement ( ",he", "Helium"        ), // Atomic number: 2
  new ChemicalElement ( ",ho", "Holmium"       ), // Atomic number: 67
  new ChemicalElement ( ",h",  "Hydrogen"      ), // Atomic number: 1
  new ChemicalElement ( ",in", "Indium"        ), // Atomic number: 49
  new ChemicalElement ( ",i",  "Iodine"        ), // Atomic number: 53
  new ChemicalElement ( ",ir", "Iridium"       ), // Atomic number: 77
  new ChemicalElement ( ",fe", "Iron"          ), // Atomic number: 26
  new ChemicalElement ( ",kr", "Krypton"       ), // Atomic number: 36
  new ChemicalElement ( ",la", "Lanthanum"     ), // Atomic number: 57
  new ChemicalElement ( ",lr", "Lawrencium"    ), // Atomic number: 103
  new ChemicalElement ( ",pb", "Lead"          ), // Atomic number: 82
  new ChemicalElement ( ",li", "Lithium"       ), // Atomic number: 3
  new ChemicalElement ( ",lu", "Lutetium"      ), // Atomic number: 71
  new ChemicalElement ( ",mg", "Magnesium"     ), // Atomic number: 12
  new ChemicalElement ( ",mn", "Manganese"     ), // Atomic number: 25
  new ChemicalElement ( ",mt", "Meitnerium"    ), // Atomic number: 109
  new ChemicalElement ( ",md", "Mendelevium"   ), // Atomic number: 101
  new ChemicalElement ( ",hg", "Mercury"       ), // Atomic number: 80
  new ChemicalElement ( ",mo", "Molybdenum"    ), // Atomic number: 42
  new ChemicalElement ( ",nd", "Neodymium"     ), // Atomic number: 60
  new ChemicalElement ( ",ne", "Neon"          ), // Atomic number: 10
  new ChemicalElement ( ",np", "Neptunium"     ), // Atomic number: 93
  new ChemicalElement ( ",ni", "Nickel"        ), // Atomic number: 28
  new ChemicalElement ( ",nh ","Nihonium"      ), // Atomic number: 113
  new ChemicalElement ( ",nb", "Niobium"       ), // Atomic number: 41
  new ChemicalElement ( ",n",  "Nitrogen"      ), // Atomic number: 7
  new ChemicalElement ( ",no", "Nobelium"      ), // Atomic number: 102
  new ChemicalElement ( ",os", "Osmium"        ), // Atomic number: 76
  new ChemicalElement ( ",o",  "Oxygen"        ), // Atomic number: 8
  new ChemicalElement ( ",pd", "Palladium"     ), // Atomic number: 46
  new ChemicalElement ( ",p",  "Phosphorus"    ), // Atomic number: 15
  new ChemicalElement ( ",pt", "Platinum"      ), // Atomic number: 78
  new ChemicalElement ( ",pu", "Plutonium"     ), // Atomic number: 94
  new ChemicalElement ( ",po", "Polonium"      ), // Atomic number: 84
  new ChemicalElement ( ",k",  "Potassium"     ), // Atomic number: 19
  new ChemicalElement ( ",pr", "Praseodymium"  ), // Atomic number: 59
  new ChemicalElement ( ",pm", "Promethium"    ), // Atomic number: 61
  new ChemicalElement ( ",pa", "Protactinium"  ), // Atomic number: 91
  new ChemicalElement ( ",ra", "Radium"        ), // Atomic number: 88
  new ChemicalElement ( ",rn", "Radon"         ), // Atomic number: 86
  new ChemicalElement ( ",re", "Rhenium"       ), // Atomic number: 75
  new ChemicalElement ( ",rh", "Rhodium"       ), // Atomic number: 45
  new ChemicalElement ( ",rg", "Roentgenium"   ), // Atomic number: 111
  new ChemicalElement ( ",rb", "Rubidium"      ), // Atomic number: 37
  new ChemicalElement ( ",ru", "Ruthenium"     ), // Atomic number: 44
  new ChemicalElement ( ",rf", "Rutherfordium" ), // Atomic number: 104
  new ChemicalElement ( ",sm", "Samarium"      ), // Atomic number: 62
  new ChemicalElement ( ",sc", "Scandium"      ), // Atomic number: 21
  new ChemicalElement ( ",sg", "Seaborgium"    ), // Atomic number: 106
  new ChemicalElement ( ",se", "Selenium"      ), // Atomic number: 34
  new ChemicalElement ( ",si", "Silicon"       ), // Atomic number: 14
  new ChemicalElement ( ",ag", "Silver"        ), // Atomic number: 47
  new ChemicalElement ( ",na", "Sodium"        ), // Atomic number: 11
  new ChemicalElement ( ",sr", "Strontium"     ), // Atomic number: 38
  new ChemicalElement ( ",s",  "Sulfur"        ), // Atomic number: 16
  new ChemicalElement ( ",ta", "Tantalum"      ), // Atomic number: 73
  new ChemicalElement ( ",tc", "Technetium"    ), // Atomic number: 43
  new ChemicalElement ( ",te", "Tellurium"     ), // Atomic number: 52
  new ChemicalElement ( ",tb", "Terbium"       ), // Atomic number: 65
  new ChemicalElement ( ",tl", "Thallium"      ), // Atomic number: 81
  new ChemicalElement ( ",th", "Thorium"       ), // Atomic number: 90
  new ChemicalElement ( ",tm", "Thulium"       ), // Atomic number: 69
  new ChemicalElement ( ",sn", "Tin"           ), // Atomic number: 50
  new ChemicalElement ( ",ti", "Titanium"      ), // Atomic number: 22
  new ChemicalElement ( ",w",  "Tungsten"      ), // Atomic number: 74
  new ChemicalElement ( ",xe", "Xenon"         ), // Atomic number: 54
  new ChemicalElement ( ",yb", "Ytterbium"     ), // Atomic number: 70
  new ChemicalElement ( ",y",  "Yttrium"       ), // Atomic number: 39
  new ChemicalElement ( ",zn", "Zinc"          ), // Atomic number: 30
  new ChemicalElement ( ",zr", "Zirconium"     )  // Atomic number: 40
 };
  static final HashMap<String,String> elements =
               new HashMap<String,String>();

  static boolean done = makeTable();

  String symbol;
  String name;
  boolean singleLetterName = false;
//================================================================
ChemicalElement( String symbol, String name ){
 this.symbol = symbol;
 this.name = name;
 if (name.length() == 2){
  singleLetterName = true;
 }
}
String getSymbol(){return symbol;}
String getName(){return name;}
/**Determines if an ASCII braille string is a chemical
   symbol for an element.
*/
public static boolean isChemicalSymbol( String aBrl ){
 //log.trace ("isChemicalSymbol? "+aBrl.toLowerCase());
 if (aBrl.length() > 3) return false;
 return elements.containsKey( aBrl.toLowerCase() );
}
//----------------------------------------------------------------
/**Determines if a braille capital letter is a 
   chemical symbol for an element.
*/
public static boolean isSingleLetterSymbol( String aBrl ){
 return elements.containsKey( aBrl.toLowerCase() );
}
//---------------------------------------------------------------- 
/**Determines if a sequence of braille capital letters possibly
   followed by a single small letter
   could be a sequence of chemical symbols.  
*/
public static boolean isChemSeq( String inSeq, boolean lastDouble ){
 String possEls = inSeq;
 if (lastDouble){
   boolean last = isChemicalSymbol( inSeq.substring(inSeq.length()-3) );
   if (!last) return false;
   possEls = inSeq.substring(0, inSeq.length()-3 );
 }
 for (int i=0; i<possEls.length(); i = i+2){
  if (!isSingleLetterSymbol( possEls.substring( i, i+2 ) )) {
    return false;
  }
 }
 return true;
} 
static boolean makeTable(){
 for (int i=0; i<elementTable.length; i++){
  String sym = elementTable[i].getSymbol(); 
  String name = elementTable[i].getName(); 
  elements.put( sym, name );
 }
 int numberOfElements = elements.size();
 return true;
}
}//End Class ChemicalElements.  
  
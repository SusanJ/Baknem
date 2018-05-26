# Baknem
Accurate backtranslation of Nemeth braille math to MathML using ANTLR 4 parser generator.

  Windows command line to create lexer:
`java -jar lib\antlr-4.7.1-complete.jar -o src\nem BaknemLexer.g4`

 Windows command line to create parser:
 `java -jar lib\antlr-4.7.1-complete.jar -o src\nem BaknemParser.g4`
 
 Lexer must be created first since parser needs lexer token names.
 

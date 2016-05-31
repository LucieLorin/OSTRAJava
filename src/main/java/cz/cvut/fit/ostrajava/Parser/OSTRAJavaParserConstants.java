/* Generated By:JJTree&JavaCC: Do not edit this line. OSTRAJavaParserConstants.java */
package cz.cvut.fit.ostrajava.Parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface OSTRAJavaParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 6;
  /** RegularExpression Id. */
  int FORMAL_COMMENT = 7;
  /** RegularExpression Id. */
  int MULTI_LINE_COMMENT = 8;
  /** RegularExpression Id. */
  int BEGIN = 9;
  /** RegularExpression Id. */
  int END = 10;
  /** RegularExpression Id. */
  int ENDLINE = 11;
  /** RegularExpression Id. */
  int CLASS = 12;
  /** RegularExpression Id. */
  int EXTENDS = 13;
  /** RegularExpression Id. */
  int DECLARATION = 14;
  /** RegularExpression Id. */
  int THROW = 15;
  /** RegularExpression Id. */
  int THROWS = 16;
  /** RegularExpression Id. */
  int SUPER = 17;
  /** RegularExpression Id. */
  int THIS = 18;
  /** RegularExpression Id. */
  int VOID = 19;
  /** RegularExpression Id. */
  int NULL = 20;
  /** RegularExpression Id. */
  int TRUE = 21;
  /** RegularExpression Id. */
  int FALSE = 22;
  /** RegularExpression Id. */
  int NEW = 23;
  /** RegularExpression Id. */
  int IF = 24;
  /** RegularExpression Id. */
  int ELSEIF = 25;
  /** RegularExpression Id. */
  int ELSE = 26;
  /** RegularExpression Id. */
  int WHILE = 27;
  /** RegularExpression Id. */
  int BREAK = 28;
  /** RegularExpression Id. */
  int CONTINUE = 29;
  /** RegularExpression Id. */
  int TRY = 30;
  /** RegularExpression Id. */
  int CATCH = 31;
  /** RegularExpression Id. */
  int FINALLY = 32;
  /** RegularExpression Id. */
  int RETURN = 33;
  /** RegularExpression Id. */
  int STATIC = 34;
  /** RegularExpression Id. */
  int NATIVE = 35;
  /** RegularExpression Id. */
  int INT = 36;
  /** RegularExpression Id. */
  int BOOLEAN = 37;
  /** RegularExpression Id. */
  int FLOAT = 38;
  /** RegularExpression Id. */
  int CHAR = 39;
  /** RegularExpression Id. */
  int DEBUG = 40;
  /** RegularExpression Id. */
  int SWITCH = 41;
  /** RegularExpression Id. */
  int CASE = 42;
  /** RegularExpression Id. */
  int _DEFAULT = 43;
  /** RegularExpression Id. */
  int FOR = 44;
  /** RegularExpression Id. */
  int INSTANCEOF = 45;
  /** RegularExpression Id. */
  int IMPORT = 46;
  /** RegularExpression Id. */
  int INTEGER_LITERAL = 47;
  /** RegularExpression Id. */
  int DECIMAL_LITERAL = 48;
  /** RegularExpression Id. */
  int HEX_LITERAL = 49;
  /** RegularExpression Id. */
  int OCTAL_LITERAL = 50;
  /** RegularExpression Id. */
  int FLOATING_POINT_LITERAL = 51;
  /** RegularExpression Id. */
  int EXPONENT = 52;
  /** RegularExpression Id. */
  int CHARACTER_LITERAL = 53;
  /** RegularExpression Id. */
  int STRING_LITERAL = 54;
  /** RegularExpression Id. */
  int LPAREN = 55;
  /** RegularExpression Id. */
  int RPAREN = 56;
  /** RegularExpression Id. */
  int LBRACE = 57;
  /** RegularExpression Id. */
  int RBRACE = 58;
  /** RegularExpression Id. */
  int LBRACKET = 59;
  /** RegularExpression Id. */
  int RBRACKET = 60;
  /** RegularExpression Id. */
  int COMMA = 61;
  /** RegularExpression Id. */
  int DOT = 62;
  /** RegularExpression Id. */
  int ASSIGN = 63;
  /** RegularExpression Id. */
  int GT = 64;
  /** RegularExpression Id. */
  int LT = 65;
  /** RegularExpression Id. */
  int BANG = 66;
  /** RegularExpression Id. */
  int EQ = 67;
  /** RegularExpression Id. */
  int LE = 68;
  /** RegularExpression Id. */
  int GE = 69;
  /** RegularExpression Id. */
  int NE = 70;
  /** RegularExpression Id. */
  int SC_OR = 71;
  /** RegularExpression Id. */
  int SC_AND = 72;
  /** RegularExpression Id. */
  int PLUS = 73;
  /** RegularExpression Id. */
  int MINUS = 74;
  /** RegularExpression Id. */
  int STAR = 75;
  /** RegularExpression Id. */
  int SLASH = 76;
  /** RegularExpression Id. */
  int REM = 77;
  /** RegularExpression Id. */
  int IDENTIFIER = 78;
  /** RegularExpression Id. */
  int LETTER = 79;
  /** RegularExpression Id. */
  int DIGIT = 80;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "<SINGLE_LINE_COMMENT>",
    "<FORMAL_COMMENT>",
    "<MULTI_LINE_COMMENT>",
    "\"banik\"",
    "\"fajront\"",
    "\"pyco\"",
    "\"tryda\"",
    "\"fagan od\"",
    "\"toz\"",
    "\"mrdnut\"",
    "\"muze mrdnut\"",
    "\"forant\"",
    "\"joch\"",
    "\"fraj\"",
    "\"chuj\"",
    "\"fajne\"",
    "\"nyt\"",
    "\"zrob\"",
    "\"kaj\"",
    "\"kajtez\"",
    "\"boinak\"",
    "\"rubat\"",
    "\"zdybat\"",
    "\"dlabat\"",
    "\"lajsnut\"",
    "\"lapnut\"",
    "\"fertyk\"",
    "\"davaj\"",
    "\"statyk\"",
    "\"natyv\"",
    "\"cyslo\"",
    "\"bul\"",
    "\"cyslo_desetinne\"",
    "\"chachar\"",
    "\"dechrobok\"",
    "\"switch\"",
    "\"case\"",
    "\"default\"",
    "\"for\"",
    "\"instanceof\"",
    "\"import\"",
    "<INTEGER_LITERAL>",
    "<DECIMAL_LITERAL>",
    "<HEX_LITERAL>",
    "<OCTAL_LITERAL>",
    "<FLOATING_POINT_LITERAL>",
    "<EXPONENT>",
    "<CHARACTER_LITERAL>",
    "<STRING_LITERAL>",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\",\"",
    "\".\"",
    "\"=\"",
    "\">\"",
    "\"<\"",
    "\"!\"",
    "\"==\"",
    "\"<=\"",
    "\">=\"",
    "\"!=\"",
    "\"ci\"",
    "\"aj\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"%\"",
    "<IDENTIFIER>",
    "<LETTER>",
    "<DIGIT>",
    "\":\"",
  };

}

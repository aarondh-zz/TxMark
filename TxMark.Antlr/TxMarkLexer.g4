lexer grammar  TxMarkLexer;

HTML_COMMENT    
    : '<!--' .*? '-->'
    ;

MACRO_OPEN
    : '(' -> pushMode(MACRO_MODE)
    ;
            
OPEN_HOOK
    : '['
    ;
            
CLOSE_HOOK
    : ']'
    ;

OPEN_SCRIPT
    : '<' S C R I P T .*? '>' ->pushMode(SCRIPT_MODE)
    ;

OPEN_STYLE
    : '<' S T Y L E .*? '>'  ->pushMode(STYLE_MODE)
    ;

LESS_THAN
	: '<'
	;
	            
QUESTION_MARK
    : '?'
    ;

DOLLAR_SIGN
    : '$'
    ;

VERTICAL_BAR
    : '|'
    ;

COLON
    : ':'
    ;

SLASH
    : '/'
    ;

EQUALS
    : '='
    ;

DOUBLE_QUOTE
    : '"'
    ;

SINGLE_QUOTE
    : '\''
    ;

GREATER_THAN
    : '>'
    ;

ASTERISK
    : '*'
    ;

DOUBLE_SINGLE_QUOTE
    : '\'\''
    ;

DOUBLE_SLASH
    : '//'
    ;

DOUBLE_TILDA
    : '~~'
    ;

DOUBLE_CIRCUMFLEX
    : '^^'
    ;

DOUBLE_ASTERISK
    : '**'
    ;

PUNCTUATION
	: PUNCTUATION_FRAG
	| CONTROL_PUNCTUATION_FRAG
	;

LITERAL
    : '`' ('``'|.)*? '`'
	;

WORD
	: WORD_FRAG
	;

NUMBER
	:
	NUMBER_FRAG
	;

WHITESPACE
    :  WHITESPACE_FRAG
    ;
            
SYMBOL
    : ~[CONTROL_PUNCTUATION_FRAG LETTER DIGIT_FRAG]
	;

//
// macro declarations
//    
mode MACRO_MODE;

MWHITESPACE
    :  WHITESPACE_FRAG -> channel(HIDDEN)
    ;
            
MCOMMA
    : ','
    ;

MCOLON
    : ':'
    ;

MNUMBER
	: NUMBER_FRAG
	;

MDOLLAR_SIGN
	: '$'
	;

MQUESTION_MARK
	: '$'
	;

KEYWORD_IF
	: I F
	;

KEYWORD_SET
	: S E T
	;

KEYWORD_TO
	: T O
	;

KEYWORD_ELSEIF
	: E L S E I F
	| E L S E '-'  I F
	| E L S E '_' I F
	;

KEYWORD_EACH
	: E A C H
	;

KEYWORD_ELSE
	: E L S E
	;

CONSTANT_TRUE
	: T R U E
	;

CONSTANT_FALSE
	: F A L S E
	;

CONSTANT_NULL
	: N U L L
	;

OPERATOR_AS
	: A S
	;

OPERATOR_ST
	: S T
	;

OPERATOR_RD
	: R D
	;

OPERATOR_ND
	: N D
	;

OPERATOR_TH
	: T H
	;

OPERATOR_LESS_THAN
    : '<'
    ;

OPERATOR_GREATER_THAN
    : '>'
    ;

OPERATOR_LESS_OR_EQUAL
    : '<='
    ;

OPERATOR_GREATER_OR_EQUAL
    : '>='
    ;

OPERATOR_EQUAL
    : '='
    ;

OPERATOR_AND
    : A N D
    ;

OPERATOR_OR
    : O R
    ;

OPERATOR_IS
    : I S
    ;

OPERATOR_NOT
    : N O T
    ;

OPERATOR_TO
    : T O
    ;

OPERATOR_POSSESSIVE
    : '\'' S
    ;

OPERATOR_OF
	: O F
	;

OPERATOR_PLUS
    : '+'
    ;

OPERATOR_MINUS
    : '-'
    ;

OPERATOR_DIVIDE
    : '/'
    ;

OPERATOR_MULTIPLY
    : '*'
    ;

OPERATOR_MODULO
    : '%'
    ;

OPERATOR_POWER
    : '^'
    ;

OPEN_PARENTHESES
    : '(' -> pushMode(MACRO_MODE)
    ;

CLOSE_PARENTHESES
    : ')' -> popMode
    ;

DOUBLE_QUOTE_STRING
    : '"' ~["]* '"'
    ;

MWORD:
	WORD_FRAG
	;

//
// <scripts>
//
mode SCRIPT_MODE;

SCRIPT_BODY
    : .*? '</' S C R I P T '>' -> popMode
    ;

SCRIPT_SHORT_BODY
    : .*? '</>' -> popMode
    ;

//
// <styles>
//
mode STYLE_MODE;

STYLE_BODY
    : .*? '</' S T Y L E '>' -> popMode
    ;

STYLE_SHORT_BODY
    : .*? '</>' -> popMode
    ;

fragment HEXCHARS_FRAG
    : '#' [0-9a-fA-F]+
    ;

fragment DECCHARS_FRAG
    : [0-9]+ '%'?
    ;

fragment DOUBLE_QUOTE_STRING_FRAG
    : '"' ~["]* '"'
    ;

fragment SINGLE_QUOTE_STRING_FRAG
    : '\'' ~[']* '\''
    ;

fragment
HEXDIGIT_FRAG        
    : [a-fA-F0-9]
    ;

fragment
DIGIT_FRAG           
    : [0-9]
    ;

fragment NUMBER_FRAG
	: '-'? DIGIT_FRAG+('.' DIGIT_FRAG+)?([eE][+-]DIGIT_FRAG+)?
	;


fragment WORD_FRAG
	: LETTER_FRAG LETTER_CHAR_FRAG*
	;

fragment
LETTER_CHAR_FRAG       
    : LETTER_FRAG
    | '-' 
    | '_' 
    | DIGIT_FRAG
    |   '\u00B7'
    |   '\u0300'..'\u036F'
    |   '\u203F'..'\u2040'
    ;

fragment
LETTER_FRAG
    :   [a-zA-Z]
	|   '\u2070'..'\u218F' 
    |   '\u2C00'..'\u2FEF' 
    |   '\u3001'..'\uD7FF' 
    |   '\uF900'..'\uFDCF' 
    |   '\uFDF0'..'\uFFFD'
    ;

fragment
TAG_CHAR_FRAG        
    : TAG_START_CHAR_FRAG
    | '-' 
    | '_' 
    | '.' 
    | DIGIT_FRAG
    |   '\u00B7'
    |   '\u0300'..'\u036F'
    |   '\u203F'..'\u2040'
    ;

fragment
TAG_START_CHAR_FRAG
    :   [:a-zA-Z]
    |   '\u2070'..'\u218F' 
    |   '\u2C00'..'\u2FEF' 
    |   '\u3001'..'\uD7FF' 
    |   '\uF900'..'\uFDCF' 
    |   '\uFDF0'..'\uFFFD'
    ;

//

fragment
CONTROL_PUNCTUATION_FRAG
	: 
	| '$'
	| '('
	| '{'
	| '}'
	| '['
	| ']'
	| '|'
	| '"'
	| '\''
	| '<'
	| '>'
	| '?'
	;

fragment
PUNCTUATION_FRAG
	: '~'
	| '!'
	| '@'
	| '#'
	| '%'
	| '^'
	| '&'
	| '*'
	| ')'
	| '_'
	| '-'
	| '+'
	| '='
	| '{'
	| '}'
	| '\\'
	| ':'
	| ';'
	| ','
	| '>'
	| '.'
	| '/'
	;

fragment
WHITESPACE_FRAG
	: (' '|'\t'|'\r'? '\n')+
	;

fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');

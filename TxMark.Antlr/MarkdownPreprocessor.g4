grammar MarkdownPreprocessor;

document    
    : line* textLine? EOF
    ;

line
	: heading carriageReturn
	| list
	| blockquote
	| textLine carriageReturn
	| paragraph_end
	;

carriageReturn 
	: softCarriageReturn
	| hardCarriageReturn
	;

softCarriageReturn 
	: CARRIAGE_RETURN
	;

hardCarriageReturn 
	: space space CARRIAGE_RETURN
	;


list
	: (listItem carriageReturn | indentedText carriageReturn )+
	;

listItem
	: (listItemIndicator whitespace?)+ text
	;

indentedText
	: (tab+ | space space space space+) (tab|space)* text
	;

listItemIndicator
	: ASTERISK
	| DIGIT+ PERIOD
	;

blockquote
	: (blockquoteItem carriageReturn | indentedText carriageReturn )+
	;

blockquoteItem
	: (blockquoteIndicator whitespace?)+ blockQuoteElement
	;

blockQuoteElement 
	: heading
	| blockQuoteListItem
	| textLine
	;

blockQuoteListItem
	: (listItemIndicator whitespace?)+  text
	;

blockquoteIndicator
	: GREATER_THAN
	;

heading
	: (headingIndicator)+ whitespace text
	;

headingIndicator
	: HASH
	;


textLine
	: whitespace* text
	;

paragraph_end
	: (whitespace* softCarriageReturn)+
	;

text
   : nonWhitespace+ (whitespace|nonWhitespace | HASH | ASTERISK | LESS_THAN | SLASH | PERIOD)*
   | openTag textLine*
   | closeTag textLine*
   ;

attributeContent
	: (whitespace|anyNonWhitespace|CARRIAGE_RETURN)*
	;

attributeValue
	: DOUBLE_QUOTE (whitespace|anyNonWhitespace)*? DOUBLE_QUOTE
	| SINGLE_QUOTE (whitespace|anyNonWhitespace)*? SINGLE_QUOTE
	;

attributeName
	: identifier
	;

attribute
	: anyWhitespace* attributeName  anyWhitespace*  EQUAL anyWhitespace* attributeValue
	;

tag
	: identifier
	;

openTag
	: LESS_THAN tag attribute* anyWhitespace* SLASH? GREATER_THAN
	;

closeTag
	: LESS_THAN SLASH tag anyWhitespace* GREATER_THAN
	;

identifier
	: (LETTER | COLON)+ (LETTER | DIGIT | COLON | UNDERBAR | DASH | PERIOD | COLON)*
	;

whitespace 
	: space 
	| tab
	;

space 
	: SPACE
	;

tab 
	: TAB
	;

anyNonWhitespace
	: nonWhitespace | HASH | ASTERISK | LESS_THAN | GREATER_THAN | SLASH | PERIOD
	;

nonWhitespace 
	: NON_WHITESPACE
	| PUNCTUATION
	| DIGIT
	| LETTER
	| EQUAL
	| DOUBLE_QUOTE
	| SINGLE_QUOTE
	| COLON 
	| DASH 
	| UNDERBAR
	| PERIOD
	;

anyWhitespace
	: whitespace
	| CARRIAGE_RETURN
	;

DOUBLE_QUOTE
	: '"'
	;

SINGLE_QUOTE
	: '\''
	;

ASTERISK
	: '*'
	;

HASH
	: '#'
	;

PERIOD
	: '.'
	;


COLON
	: ':'
	;

UNDERBAR
	: '_'
	;

DASH
	: '-'
	;


DIGIT
	: [0-9]
	;

LETTER
	: [a-zA-Z]
	;

PUNCTUATION
	: [~`!@$%^&()+{\[}\]|\\;,?]
	;

TAB
   : '\t'
   ;

EQUAL
   : '='
   ;

SPACE
   : ' '
   ;

LESS_THAN
   : '<'
   ;

GREATER_THAN
   : '>'
   ;

SLASH
   : '/'
   ;

CARRIAGE_RETURN
   : ('\r'? '\n')
   ;

NON_WHITESPACE
   : ~[ ' ' '\t' '\r' '\n' '#' '*' '/' '<' '>' '.']
   ;

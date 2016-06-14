grammar MarkdownPreprocessor;

document    
    : content EOF
    ;

content
	: line*
	;

line
	: heading carriageReturn
	| list
	| blockquote
	| textLine carriageReturn
	| paragraph_end
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
	: '*'
	| DIGITS '.'
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
	: '>'
	;

heading
	: (headingIndicator)+ whitespace text
	;

headingIndicator
	: '#'
	;


textLine
	: whitespace* text
	;

paragraph_end
	: whitespace* carriageReturn
	;

text
   : nonWhitespace (whitespace|nonWhitespace|'#'|'*'|'>'|'.')*?
   ;

nonWhitespace 
	: NON_WHITESPACE
	| PUNCTUATION
	| DIGITS
	;

whitespace 
	: space | tab
	;

space 
	: SPACE
	;

tab 
	: TAB
	;

carriageReturn 
	: softCarriageReturn
	| hardCarriageReturn
	;

softCarriageReturn 
	: CARRIAGE_RETURN
	;

hardCarriageReturn 
	: space space+ CARRIAGE_RETURN
	;

DIGITS
	: [0123456789]+
	;

PUNCTUATION
	: [~`!@$%^&()_-+={\[}\]|\\:;"'<,?/]+
	;

TAB
   : '\t'
   ;

SPACE
   : ' '
   ;

CARRIAGE_RETURN
   : ('\r'? '\n')
   ;

NON_WHITESPACE
   : ~[ '\t' '\r' '\n' '#' '*' '>' '.']
   ;

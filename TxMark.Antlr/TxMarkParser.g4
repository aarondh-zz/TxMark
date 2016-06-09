parser grammar TxMarkParser;

options { tokenVocab=TxMarkLexer; }

document    
    : content EOF
    ;

word
	: WORD
	| MWORD
	;

whitespace
	: WHITESPACE
	;

left_nametag:
	VERTICAL_BAR word COLON
	;

right_nametag:
	COLON word VERTICAL_BAR
	;

variable
	: DOLLAR_SIGN word
	| MDOLLAR_SIGN word
	;

hookName
	: QUESTION_MARK word
	| MQUESTION_MARK word
	;

number
	: NUMBER
	| MNUMBER
	;

quote:
	DOUBLE_QUOTE_STRING
	| SINGLE_QUOTE_STRING
	;

indexSuffix
	: OPERATOR_ST
	| OPERATOR_RD
	| OPERATOR_ND
	| OPERATOR_TH
	;

indexExpression:
	operand OPERATOR_POSSESSIVE number indexSuffix
	| operand OPERATOR_POSSESSIVE OPEN_PARENTHESES expression CLOSE_PARENTHESES 
	;

booleanOperator:
	  OPERATOR_AND
	| OPERATOR_OR
	| OPERATOR_LESS_THAN
	| OPERATOR_GREATER_THAN
	| OPERATOR_LESS_OR_EQUAL
	| OPERATOR_GREATER_OR_EQUAL
	| OPERATOR_POSSESSIVE
	| OPERATOR_IS OPERATOR_NOT
	| OPERATOR_IS
	;
subequation
	: booleanOperator expression
	;

equation:
	expression subexpression
	;

operand
  : variable 
  | hookName 
  | constant 
  | ( OPEN_PARENTHESES expression CLOSE_PARENTHESES ) 
  ;

signed_operand
  : (OPERATOR_MINUS)? operand
  ;

power_expression
	: signed_operand (OPERATOR_POWER expression)?
	;

multiply_subexpression
	:  (OPERATOR_MULTIPLY | OPERATOR_DIVIDE | OPERATOR_MODULO ) power_expression
	;

multiply_expression
  : power_expression multiply_subexpression*
  ;

subexpression 
	: ( OPERATOR_PLUS | OPERATOR_MINUS ) multiply_expression
	;

expression
  : multiply_expression subexpression*
  ;

constantTrue
	: CONSTANT_TRUE
	;
constantFalse
	: CONSTANT_FALSE
	;

constantNull
	: CONSTANT_NULL
	;

constant
  : number
  | constantTrue
  | constantFalse
  | constantNull

  | quote
  ;

macroArgument:
	expression
	;

literal
	: LITERAL
	;


punctuation 
	: PUNCTUATION
	;

muinuta 
	:  DOLLAR_SIGN
	| QUESTION_MARK
	| COLON	
	| SLASH	
	| EQUALS	
	| VERTICAL_BAR
	| LESS_THAN
	| GREATER_THAN	
	| DOUBLE_QUOTE	
	| SINGLE_QUOTE	
	;
htmlOpenTag
	: LESS_THAN word htmlAttribute* GREATER_THAN
    | LESS_THAN word htmlAttribute* SLASH GREATER_THAN
	;

htmlCloseTag
	: LESS_THAN SLASH word GREATER_THAN
	;

htmlElement     
    : htmlOpenTag
	| htmlCloseTag
    | script
    | style
    ;

emphasis
	: ASTERISK content ASTERISK #single_emphasis
	| DOUBLE_ASTERISK content DOUBLE_ASTERISK #double_emphasis
	| DOUBLE_SINGLE_QUOTE content DOUBLE_SINGLE_QUOTE #boldface
	| DOUBLE_SLASH content DOUBLE_SLASH #italics
	| DOUBLE_TILDA content DOUBLE_TILDA #deleted
	| DOUBLE_CIRCUMFLEX content DOUBLE_CIRCUMFLEX #superscript
	;

htmlAttribute   
    : whitespace? word whitespace? EQUALS whitespace? htmlAttributeValue
    ;

htmlAttributeValueContent 
	: phrase 
	| hookName
	| variable
	| literal
	| muinuta
	| whitespace
	| punctuation
	;

htmlAttributeValue
    : DOUBLE_QUOTE htmlAttributeValueContent*? DOUBLE_QUOTE
    | SINGLE_QUOTE htmlAttributeValueContent*? SINGLE_QUOTE
    ;

script
    : OPEN_SCRIPT ( SCRIPT_BODY | SCRIPT_SHORT_BODY)
    ;

style
    : OPEN_STYLE ( STYLE_BODY | STYLE_SHORT_BODY)
    ;

element 
	: if_clause
	| each_clause
	| set_clause
	| macro_clause (whitespace? macro_clause)*
	| hook_clause 
	| htmlElement
	| hookName
	| variable
	| literal
	| emphasis
	| muinuta
	;

content     
    : phrase? (element phrase?)*
    ;

phrase
	: (word | number | whitespace | punctuation)+
	;

hook_clause
	: left_nametag? hook right_nametag?
	;

macro_clause 
	: left_nametag? macro (whitespace? hook right_nametag?)?
	;

each_clause
	: MACRO_OPEN KEYWORD_EACH MCOLON macroArgument (OPERATOR_AS variable)? CLOSE_PARENTHESES (whitespace? hook)?
	;

elseIf_clause
	: MACRO_OPEN KEYWORD_ELSEIF MCOLON macroArgument CLOSE_PARENTHESES (whitespace? hook)?
	  (whitespace? (elseIf_clause | else_clause))?
	;

else_clause
	: MACRO_OPEN KEYWORD_ELSE MCOLON CLOSE_PARENTHESES (whitespace? hook)?
	;

if_clause
	: MACRO_OPEN KEYWORD_IF MCOLON macroArgument CLOSE_PARENTHESES (whitespace? hook)?
	  (whitespace? (elseIf_clause | else_clause))?
	;

set_clause
	: MACRO_OPEN KEYWORD_SET MCOLON variable KEYWORD_TO macroArgument CLOSE_PARENTHESES
	;

macro
    :  MACRO_OPEN macroName MCOLON (macroArgument (MCOMMA macroArgument )*?)? (OPERATOR_AS variable)? CLOSE_PARENTHESES
    ;

hook
    : OPEN_HOOK content CLOSE_HOOK
    ;

macroName
    : MWORD
    ;

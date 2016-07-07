/*
 *  TxMark 1.0.0.alpha-5-g61bda79
 *
 *  Copyright (c) 2016 Aaron G. Daisley-Harrison
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
parser grammar TxMarkParser;

options { tokenVocab=TxMarkLexer; }

document    
    : content EOF
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

word
	: WORD
	| MWORD
	;

number
	: NUMBER
	| MNUMBER
	;

quote
	: DOUBLE_QUOTE_STRING
	;

operand
  : variable 
  | hookName 
  | submacro 
  | constant
  | word 
  | ( OPEN_PARENTHESIS expression CLOSE_PARENTHESIS ) 
  ;

indexSuffix
	: OPERATOR_ST
	| OPERATOR_ND
	| OPERATOR_RD
	| OPERATOR_TH
	;

indexOperand
	: number indexSuffix OPERATOR_LAST?
	| OPERATOR_LAST
	| OPEN_PARENTHESIS expression CLOSE_PARENTHESIS
	| quote
	| word
	;

indexOf_subexpression
	: OPERATOR_OF operand
	;

index_subexpression
	: OPERATOR_POSSESSIVE indexOperand
	;

index_expression
	: operand index_subexpression*
	| indexOperand OPERATOR_OF index_expression
	;

signed_index_expression
  : (OPERATOR_MINUS)? index_expression
  ;


booleanOperator:
	  OPERATOR_AND
	| OPERATOR_OR
	| OPERATOR_LESS_THAN
	| OPERATOR_GREATER_THAN
	| OPERATOR_LESS_OR_EQUAL
	| OPERATOR_GREATER_OR_EQUAL
	| OPERATOR_IS OPERATOR_NOT
	| OPERATOR_IS OPERATOR_IN
	| OPERATOR_IS
	| OPERATOR_CONTAINS
	| OPERATOR_POWER
	| OPERATOR_MULTIPLY 
	| OPERATOR_DIVIDE 
	| OPERATOR_MODULO
	| OPERATOR_PLUS 
	| OPERATOR_MINUS 
	;

subexpression
	: booleanOperator expression
	;

expression:
	signed_index_expression subexpression*
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
  | word
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

muinuta 
	:  DOLLAR_SIGN
	| QUESTION_MARK
	| COLON	
	| SLASH	
	| EQUALS	
	| LESS_THAN
	| GREATER_THAN
	| VERTICAL_BAR
	| GREATER_THAN	
	| DOUBLE_QUOTE	
	| SINGLE_QUOTE	
	;

htmlAttributeName
	: word
	;

htmlAttribute   
    : whitespace? htmlAttributeName whitespace? EQUALS whitespace? htmlAttributeValue
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
	| choose_clause
	| each_clause
	| set_clause
	| hook_definition_clause
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
    : phrase? (element phrase?)*?
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
	: MACRO_OPEN KEYWORD_EACH MCOLON macroArgument (OPERATOR_AS variable)? CLOSE_PARENTHESIS (whitespace? hook)?
	;

elseIf_clause
	: MACRO_OPEN KEYWORD_ELSEIF MCOLON macroArgument CLOSE_PARENTHESIS (whitespace? hook)?
	  (whitespace? (elseIf_clause | else_clause))?
	;

else_clause
	: MACRO_OPEN KEYWORD_ELSE MCOLON CLOSE_PARENTHESIS (whitespace? hook)?
	;

if_clause
	: MACRO_OPEN KEYWORD_IF MCOLON macroArgument CLOSE_PARENTHESIS (whitespace? hook)?
	  (whitespace? (elseIf_clause | else_clause))?
	;

when_clause
	: MACRO_OPEN KEYWORD_WHEN MCOLON macroArgument CLOSE_PARENTHESIS (whitespace? hook)?
	  (whitespace? (when_clause | otherwise_clause))?
	;

otherwise_clause
	: MACRO_OPEN KEYWORD_OTHERWISE MCOLON CLOSE_PARENTHESIS (whitespace? hook)?
	;
	
choose_clause
	: MACRO_OPEN KEYWORD_CHOOSE MCOLON macroArgument CLOSE_PARENTHESIS
	  (whitespace? (when_clause | otherwise_clause))?
	;

set_clause
	: MACRO_OPEN KEYWORD_SET MCOLON variable KEYWORD_TO macroArgument CLOSE_PARENTHESIS
	;

hook_definition_clause
	: MACRO_OPEN KEYWORD_HOOK MCOLON (variable | hookName) CLOSE_PARENTHESIS hook
	;

macro
    :  MACRO_OPEN macroName MCOLON (macroArgument (MCOMMA macroArgument )*)? (OPERATOR_AS variable)? CLOSE_PARENTHESIS
    ;

submacro
    : OPEN_PARENTHESIS macroName MCOLON (macroArgument (MCOMMA macroArgument )*)? CLOSE_PARENTHESIS
    ;

hook
    : OPEN_HOOK content CLOSE_HOOK
    ;

macroName
    : MWORD
    ;

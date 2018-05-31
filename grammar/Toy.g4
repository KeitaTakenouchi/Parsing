grammar Toy;

start: statements EOF;

statements: stmt*;

stmt:
	'if' '(' comparativeExpr ')' 'then' stmt ('else' stmt)?	# ifThenElse
	| 'if' '(' comparativeExpr ')' 'then' stmt				# ifThen
	| 'while' '(' comparativeExpr ')' stmt					# while
	| '{' statements '}'									# block
	| IDENT '=' expr ';'									# assignment
	| 'print' '(' expr ')' ';'								# print;

comparativeExpr:
	expr '<' expr
	| expr '==' expr
	| expr '>' expr
	| expr '>=' expr
	| expr '<=' expr;

expr:
	IDENT
	| NumLit
	| '(' expr ')'
	| expr TIMES expr
	| expr DIV expr
	| expr TIMES TIMES expr
	| expr PLUS expr
	| expr MINUS expr;

TIMES: '*';
DIV: '/';
PLUS: '+';
MINUS: '-';

fragment Char: [a-zA-Z];

IDENT: Char+;

Whitespaces: [ \t]+ -> skip;

Newline: ( '\r' '\n'? | '\n') -> skip;

NumLit: [0-9]+;

lexer grammar Toy2;

tokens { STRING }	
DOUBLE : '"' .*? '"'   -> type(STRING) ;
SINGLE : '\'' .*? '\'' -> type(STRING) ;
WS     : [ \r\t\n]+    -> skip ;

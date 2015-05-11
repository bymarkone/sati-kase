grammar Kase;

commands: command+;
command: name LEFTPARENTHESIS? params RIGHTPARENTHESIS? END_LINE?;
name: ID;
params: param*;
param: (ID|QUOTED);

ID: ALPHANUMERIC (ALPHANUMERIC)+;
QUOTED: QUOTE .*? QUOTE;
QUOTE: ('"'|'\'');
ALPHANUMERIC: ('A'..'Z' | 'a'..'z' | '0'..'9'
                  | '\u00C0'..'\u00D6'
                  | '\u00D8'..'\u00F6'
                  | '\u00F8'..'\u02FF'
                  | '\u0370'..'\u037D'
                  | '\u037F'..'\u1FFF'
                  | '\u200C'..'\u200D'
                  | '\u2070'..'\u218F'
                  | '\u2C00'..'\u2FEF'
                  | '\u3001'..'\uD7FF'
                  | '\uF900'..'\uFDCF'
                  | '\uFDF0'..'\uFFFD'
            );

LEFTPARENTHESIS: '(';
RIGHTPARENTHESIS: ')';
END_LINE: ('.' NEW_LINE?| NEW_LINE);
NEW_LINE: ('\r'? '\n');
WS: (' '|'\t')+ -> skip;

grammar Prism;

WHITESPACE: (' '|'\t'|'\n'|'\r') -> skip ;

// Tokens

A:        'A';
ARRAY:      'array';
BOOL:       'bool';
CLOCK:      'clock';
CONST:      'const';
CTMC:       'ctmc';
C:        'C';
DOUBLE:     'double';
DTMC:       'dtmc';
E:        'E';
ENDINIT:      'endinit';
ENDINVARIANT:   'endinvariant';
ENDMODULE:    'endmodule';
ENDREWARDS:   'endrewards';
ENDSYSTEM:    'endsystem';
FALSE:      'false';
FORMULA:      'formula';
FILTER:     'filter';
FUNC:       'func';
F:        'F';
GLOBAL:     'global';
G:        'G';
INIT:       'init';
INVARIANT:    'invariant';
I:        'I';
INT:        'int';
LABEL:      'label';
MAX:        'max';
MDP:        'mdp';
MIN:        'min';
MODULE:     'module';
X:        'X';
NONDETERMINISTIC: 'nondeterministic';
OF:       'of';
PMAX:       'Pmax';
PMIN:       'Pmin';
P:        'P';
PROBABILISTIC:  'probabilistic';
PROB:       'prob';
PTA:        'pta';
RATE:       'rate';
REWARDS:      'rewards';
RMAX:       'Rmax';
RMIN:       'Rmin';
R:        'R';
S:        'S';
STOCHASTIC:   'stochastic';
SYSTEM:     'system';
TRUE:       'true';
U:        'U';
W:        'W';
NOT:      '!';
AND:      '&';
OR:     '|';
IMPLIES:    '=>';
IFF:      '<=>';
RARROW:   '->';
COLON:    ':';
SEMICOLON:  ';';
COMMA:    ',';
DOTS:     '..';
LPARENTH:   '(';
RPARENTH:   ')';
LBRACKET:   '[';
RBRACKET:   ']';
DLBRACKET:  '[[';
DRBRACKET:  ']]';
LBRACE:   '{';
RBRACE:   '}';
EQ:     '=';
NE:     '!=';
LT:     '<';
GT:     '>';
DLT:      '<<';
DGT:      '>>';
LE:     '<=';
GE:     '>=';
PLUS:     '+';
MINUS:    '-';
TIMES:    '*';
DIVIDE:   '/';
PRIME:    '\'';
RENAME:   '<-';
QMARK:    '?';
DQUOTE:   '"';
REG_INT:    ([1-9]([0-9])*)|('0');
REG_DOUBLE:   ([0-9])*('.')?([0-9])+(('e'|'E')('-'|'+')?([0-9])+)?;
REG_IDENTPRIME: ([a-zA-Z]|'_')([a-zA-Z0-9]|'_')*'\'';
REG_IDENT:    ([a-zA-Z]|'_')([a-zA-Z0-9]|'_')* ;
PREPROC:      '#'(~[#])*'#';

prismfile: filetype statements
;

statements: statement+
;

statement: const_statement
        | formula_statement
        | module
        | global
        ;

filetype: DTMC
    | CTMC
    | MDP
    | PTA
    ;

term: value term_op value
    | value
    ;

const_statement: CONST REG_IDENT SEMICOLON
              |CONST const_type REG_IDENT SEMICOLON
              | CONST INT REG_IDENT EQ REG_INT SEMICOLON
              | CONST DOUBLE REG_IDENT EQ REG_DOUBLE SEMICOLON
              ;

const_type: INT
          | DOUBLE
          ;

condition_op: GE
            | EQ
            | NE
            | LE
            | AND
            | OR
            | LT
            | GT
            ;

term_op: PLUS
      |MINUS
      |TIMES
      |DIVIDE
      ;

formula_statement: FORMULA REG_IDENT EQ condition SEMICOLON;

condition: NOT? atomic_condition
        | NOT? atomic_condition condition_expand*
        | NOT? LPARENTH condition condition_expand* RPARENTH condition_expand*
        | term
        ;

atomic_condition: REG_IDENT condition_op range
                | REG_IDENT condition_op term
                | REG_IDENT condition_op (TRUE | FALSE)
                | REG_IDENT condition_op REG_IDENT
                ;

value: REG_DOUBLE
    | REG_INT
    | REG_IDENT
    ;


range: term DOTS term;


condition_expand:  condition_op condition  ;


module: MODULE REG_IDENT entries ENDMODULE;

entries: entrie+;

entrie: attribute
      |transition
      ;

attribute: REG_IDENT COLON LBRACKET range RBRACKET SEMICOLON;

transition: LBRACKET REG_IDENT? RBRACKET condition RARROW transition_rules (PLUS transition_rules)* SEMICOLON;

transition_rules: (REG_DOUBLE COLON)? LPARENTH transition_assign RPARENTH (AND LPARENTH transition_assign RPARENTH)*;

transition_assign: REG_IDENTPRIME? EQ term;

global: GLOBAL REG_IDENT COLON LBRACKET range RBRACKET SEMICOLON;




// Skip (but store) comments

COMMENT: '//' (~[\n\r])* ('\n'|'\r'|'\r\n')? -> skip ;



# RPN

This is a Scala-based console application that is a Reverse-Polish-Notation calculator. RPN is the input system used on HP calculators for years, including the old-school Computer Science lifesaver, model 16C. The premise of RPN is to utilize a "register" injection pattern such as:

    1 2 +
    
Which equates to the mental process of "1 + 2"

This application reads data fed from the command-line and serializes the elements into an equivelant calculation. The number of processess is only restricted by your runtime environment.

Valid operators are +, -, /, and 'x' (see Linux notes below)

Note: operands and results are stored as a Scala "double" precision datatype (otherwise division would produce some particular nasty results for the un-aware)

Some sample outputs:

    9 5 + 
      yields: 14.0
      
    9 5 + 2 x
      yields: 28.0
      
    9 5 + 2 x 4 /
      yields: 7.0
      
    9 5 + 2 x 4 / 6 -
      yields: 1.0
      
    9.2 3.3 +
      yields: 12.5

# Linux notes (and operator substitution)
Since the asterisk character is typcially used for environment injection whithin Linux (namely directory location), this cobebase uses a lowercase English "x" as the multiplication opertor. (Yes, the command-line arguments could ultizie escape sequences in order for the asterisk to be made functional, but that just needlessly produces an ugly processing string.)

A simple Case-statement is used to determine the appropriate operation -- so if you'd like to change the operator assignments, simply modify the corresponding string-token.




      

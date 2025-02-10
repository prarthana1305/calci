This Calculator class evaluates arithmetic expressions with +, -, *, /, and parentheses using two stacks:

values stack → Stores numbers.
operators stack → Stores operators (+, -, *, /, (, )).

## Working Process :
Iterate through the expression character by character.
If a number is found, extract the full number and push it onto values.
If ( is found, push it onto operators.
If ) is found, process operators until ( is found.
If an operator (+, -, *, /) is found : Pop and apply operators with higher or equal precedence.
Push the current operator onto operators.
After the loop, process any remaining operators.

## Helper methods
precedence(char op): Defines operator priority (* & / > + & -).
applyOp(char op, int b, int a): Performs calculations on 2 numbers based on the operator.

## Snapshots 
![image](https://github.com/user-attachments/assets/25138e82-176a-4630-9c6d-24853953782e)

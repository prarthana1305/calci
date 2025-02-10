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

![Screenshot 2025-02-10 134448](https://github.com/user-attachments/assets/d7a3f429-1c36-437f-b515-8d6fdae81d79)
![Screenshot 2025-02-10 134507](https://github.com/user-attachments/assets/6e0bbcce-70cb-463e-8ec5-a156a136cc80)
![Screenshot 2025-02-10 134520](https://github.com/user-attachments/assets/42cc0eb2-2360-42f4-a213-703ce6b8649b)


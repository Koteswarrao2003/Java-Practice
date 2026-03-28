/*
TERNARY OPERATOR IN JAVA

The ternary operator is a shortcut for
if-else statements.

Syntax:
condition ? value_if_true : value_if_false

Program Logic:
1) Compare two numbers to find maximum:
   - If a > b → max = a
   - Else → max = b

2) Check if a number is even or odd:
   - If a % 2 == 0 → Even
   - Else → Odd

This makes code shorter and easier to write.
*/

public class TernaryOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;
        System.out.println("Maximum value: " + max);

        String result = (a % 2 == 0) ? "Even number" : "Odd number";
        System.out.println("a is an " + result);
    }
}

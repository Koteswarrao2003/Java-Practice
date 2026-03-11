/*
LOGICAL OPERATORS IN JAVA

Logical operators are used to combine
multiple conditions.

Operators used in this program:

1) && (Logical AND)
   - Returns true if both conditions are true.

2) || (Logical OR)
   - Returns true if at least one condition is true.

3) ! (Logical NOT)
   - Reverses the result (true becomes false).

The program checks different conditions
using these logical operators and prints the results.
*/

public class LogicalOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(a < b && b < c);  
        System.out.println(a > b || b < c);  
        System.out.println(!(a < b));         
    }
}

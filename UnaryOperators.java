/*
UNARY OPERATORS IN JAVA

Unary operators work on a single operand.

Operators used in this program:

1) +  → Unary plus (returns value as it is)
2) -  → Unary minus (changes sign)
3) ++ → Increment operator
   - Pre-increment (++a): increases value first
   - Post-increment (a++): uses value, then increases
4) -- → Decrement operator
   - Pre-decrement (--b): decreases value first
   - Post-decrement (b--): uses value, then decreases
5) !  → Logical NOT (reverses boolean value)

The program shows how each operator works
with variables.
*/

public class UnaryOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = -5;
        boolean flag = true;

        System.out.println("Initial value of a: " + a);
        System.out.println("Initial value of b: " + b);

        System.out.println("Unary plus of a: " + (+a));
        System.out.println("Unary minus of a: " + (-a));

        System.out.println("Pre-increment of a: " + (++a));
        System.out.println("Post-increment of a: " + (a++));
        System.out.println("Value of a after post-increment: " + a);

        System.out.println("Pre-decrement of b: " + (--b));
        System.out.println("Post-decrement of b: " + (b--));
        System.out.println("Value of b after post-decrement: " + b);

        System.out.println("Logical NOT of flag: " + (!flag));
    }
}

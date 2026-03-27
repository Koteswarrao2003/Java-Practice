/*
SWAP TWO NUMBERS WITHOUT THIRD VARIABLE

This program swaps two numbers
without using a temporary variable.

Program Logic:
1) a = a + b
2) b = a - b   → gets original value of a
3) a = a - b   → gets original value of b

Example:
a = 10, b = 20
After swapping → a = 20, b = 10

This method uses arithmetic operations
to swap values.
*/

public class SwapWithOutThird{
    public static void main(String[] args) {
        int a=10;
        int b=20;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a value is: "+a);
        System.out.println("b value is: "+b);
    }
}

/*
ARITHMETIC OPERATORS PROGRAM (USING USER INPUT)

This program performs basic arithmetic operations
on two numbers given by the user.

Program Steps:
1) Take two integers as input using Scanner.
2) Perform arithmetic operations:
   +  → Addition
   -  → Subtraction
   *  → Multiplication
   /  → Division
   %  → Modulus (Remainder)
3) Print all results.

Note:
Division works for integers.
If second number is 0, division will cause error.
*/

import java.util.*;

public class ArithmeticOperators {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }
}

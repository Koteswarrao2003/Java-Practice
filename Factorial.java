/*
FACTORIAL OF A NUMBER

Factorial of a number means multiplying
all positive integers up to that number.

Example:
5! = 5 × 4 × 3 × 2 × 1 = 120

Program Logic:
1) Take a number from the user.
2) Check if the number is negative.
   - Factorial is not defined for negative numbers.
3) Use a loop from 1 to the given number.
4) Multiply each number to calculate factorial.
5) Print the result.

long data type is used to store
large factorial values.
*/

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            
            if (num < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
                return;
            }
            
            long fact = 1;
            
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println(num + " factorial is: " + fact);
        }
    }
}

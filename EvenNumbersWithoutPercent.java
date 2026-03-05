/*
PRINT EVEN NUMBERS WITHOUT USING % OPERATOR

This program prints even numbers between
two numbers given by the user.

Program Logic:
1) Take starting and ending numbers as input.
2) Use a loop to go from start to end.
3) Check even number using (i/2)*2 == i.
4) If the condition is true, the number is even.
5) Print the even numbers.

This method identifies even numbers
without using the modulus (%) operator.
*/

import java.util.Scanner;

public class EvenNumbersWithoutPercent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter a starting number: ");
        int end = sc.nextInt();
        System.out.print("Even numbers from " + start + " to "+end+" are: ");
        for (int i = start; i <= end; i++) {
            if((i/2)*2==i) { 
                System.out.print(i + " ");
            }
        }
    }
}

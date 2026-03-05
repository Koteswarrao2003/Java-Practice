/*
PRINT EVEN NUMBERS USING BITWISE OPERATOR

This program prints even numbers
between a given range.

Program Logic:
1) Take starting and ending numbers from user.
2) Use a loop to iterate from start to end.
3) Check even number using bitwise operator:
   (i & 1) == 0
4) If the condition is true, the number is even.
5) Print the even numbers.

Note:
Bitwise AND (&) with 1 checks the last bit.
If last bit is 0 → Even number.
*/

import java.util.Scanner;

public class EvenNumbersWithoutPercentWithBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a starting range: ");
        int start = sc.nextInt();
        System.out.print("Enter an ending range: ");
        int end = sc.nextInt();
        System.out.print("Even numbers from " + start + " to "+end+" are: ");
        for (int i = start; i <= end; i++) {
            if ((i & 1) == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

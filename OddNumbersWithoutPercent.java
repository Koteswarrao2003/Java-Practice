/*
PRINT ODD NUMBERS WITHOUT USING % OPERATOR

This program prints odd numbers
between two given numbers.

Program Logic:
1) Take starting and ending numbers from user.
2) Use a loop from start to end.
3) Check odd number using (i/2)*2 != i.
4) If the condition is true, the number is odd.
5) Print all odd numbers.

This method finds odd numbers
without using the modulus (%) operator.
*/

import java.util.Scanner;

public class OddNumbersWithoutPercent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter an ending number: ");
        int end = sc.nextInt();
        System.out.print("Odd numbers from " + start + " to "+end+" are: ");

        for(int i=start;i<=end;i++){
            if((i/2)*2!=i) { 
                System.out.print(i+" ");
            }
        }
    }
}   

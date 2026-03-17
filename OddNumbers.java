/*
PRINT ODD NUMBERS IN A RANGE

This program prints all odd numbers
between two given numbers.

Program Logic:
1) Take starting and ending numbers from user.
2) Use a loop from start to end.
3) Check each number using (number % 2 != 0).
4) If true, the number is odd.
5) Print all odd numbers in the range.

Odd numbers are not divisible by 2.
*/

import java.util.Scanner;

public class OddNumbers{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a starting number: ");
            int start=sc.nextInt();
            System.out.print("Enter an ending number: ");
            int end=sc.nextInt();

            System.out.print("Odd numbers from "+start+" to "+end+" are: ");

            for(int i=start;i<=end;i++){
                if(i%2!=0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}

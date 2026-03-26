/*
SUM OF DIGITS PROGRAM

This program calculates the sum
of digits of a number.

Program Logic:
1) Take a number from the user.
2) Extract each digit using % operator.
3) Add each digit to a sum variable.
4) Remove the last digit using division (/).
5) Repeat until the number becomes 0.
6) Print the final sum.

Example:
Input: 123
Output: 1 + 2 + 3 = 6
*/

import java.util.Scanner;
public class SumOfDigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int sum=0;

        while(num!=0){
            int digit=num%10;
            sum+=digit;
            num/=10; 
        }

        System.out.println("Sum is: "+sum);
    }
}

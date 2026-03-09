/*
HARSHAD (NIVEN) NUMBER PROGRAM

A Harshad or Niven number is a number
that is divisible by the sum of its digits.

Example:
18 → 1 + 8 = 9
18 ÷ 9 = 2 → Harshad number

Program Logic:
1) Take a number from the user.
2) Find the sum of its digits.
3) Check if the number is divisible by the digit sum.
4) If divisible → Harshad (Niven) number.
   Otherwise → Not a Harshad number.
*/

import java.util.Scanner;

public class HarshadOrNivenNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;

        while(num!=0){
            int digit=num%10;
            sum+=digit;
            num/=10;
        }

        if(temp%sum==0)
            System.out.println(temp+" is a Harshad or Niven number.");
        else
            System.out.println(temp+" is not a Harshad or Niven number.");

    }
}

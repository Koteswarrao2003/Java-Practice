/*
SPY NUMBER PROGRAM

A Spy Number is a number where
the sum of its digits is equal
to the product of its digits.

Example:
112 → Sum = 1 + 1 + 2 = 4
       Product = 1 × 1 × 2 = 2 → Not Spy

123 → Sum = 1 + 2 + 3 = 6
       Product = 1 × 2 × 3 = 6 → Spy Number

Program Logic:
1) Take a number from the user.
2) Extract each digit using % operator.
3) Calculate sum and product of digits.
4) Compare sum and product.
5) If equal → Spy Number
   Otherwise → Not a Spy Number.
*/

import java.util.*;
public class SpyNumber{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        int product=1;

        while(num!=0){
            int digit=num%10;
            sum+=digit;
            product*=digit;
            num/=10;
        }

        if(sum==product)
            System.out.println(temp+" is a Spy number.");
        else
            System.out.println(temp+" is not a Spy number.");

    }
}

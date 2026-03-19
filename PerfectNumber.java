/*
PERFECT NUMBER PROGRAM

A Perfect Number is a number where
the sum of its factors (excluding itself)
is equal to the number.

Example:
6 → 1 + 2 + 3 = 6 → Perfect Number

Program Logic:
1) Take a number from the user.
2) Find all factors of the number (excluding itself).
3) Add all the factors.
4) Compare the sum with the original number.
5) If equal → Perfect Number
   Otherwise → Not a Perfect Number.
*/

import java.util.*;
public class PerfectNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int sum=0;

        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }

        if(sum==num)
            System.out.println(num+" is a perfect number");
        else
            System.out.println(num+" is not a perfect number");
    }
}

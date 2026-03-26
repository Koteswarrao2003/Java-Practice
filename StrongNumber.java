/*
STRONG NUMBER PROGRAM

A Strong Number is a number where
the sum of factorials of its digits
is equal to the number itself.

Example:
145 → 1! + 4! + 5! = 1 + 24 + 120 = 145

Program Logic:
1) Take a number from the user.
2) Extract each digit using % operator.
3) Find factorial of each digit.
4) Add all factorial values.
5) Compare the sum with the original number.
6) If equal → Strong Number
   Otherwise → Not a Strong Number.
*/

import java.util.Scanner;

public class StrongNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;

        while(num!=0){
            int digit=num%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact*=i;
            }
            sum+=fact;
            num/=10;
        }

        if(temp==sum)
            System.out.println(temp+" is a strong number.");
        else
            System.out.println(temp+" is not a strong number.");
    }
}

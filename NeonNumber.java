/*
NEON NUMBER PROGRAM

A Neon Number is a number where the sum
of the digits of its square is equal
to the original number.

Example:
9² = 81
8 + 1 = 9 → Neon Number

Program Logic:
1) Take a number from the user.
2) Find the square of the number.
3) Calculate the sum of digits of the square.
4) Compare the sum with the original number.
5) If equal → Neon Number
   Otherwise → Not a Neon Number.
*/

import java.util.*;
public class NeonNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int square=num*num;
        int sum=0;
        int temp=square;

        while(temp!=0){
            int digit=temp%10;
            sum+=digit;
            temp/=10;
        }

        if(sum==num)
            System.out.println(num + " is a Neon Number.");
        else
            System.out.println(num + " is not a Neon Number.");
    }
}

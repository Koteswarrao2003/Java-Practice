/*
NUMBER PALINDROME PROGRAM

A Palindrome number is a number that
remains the same when reversed.

Example:
121 → Reverse is 121 → Palindrome

Program Logic:
1) Take a number from the user.
2) Store the original number.
3) Reverse the number using a loop.
4) Compare the reversed number with the original.
5) If both are equal → Palindrome
   Otherwise → Not a Palindrome.
*/

import java.util.Scanner;

public class NumberPalindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;

        while(num!=0){
            int digit=num%10;
            sum=sum*10+digit;
            num/=10;
        }

        if(temp==sum)
            System.out.println(temp+" is a palindrome");
        else
            System.out.println(temp+" is not a palindrome");
    }
}

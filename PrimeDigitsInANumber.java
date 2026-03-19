/*
COUNT PRIME DIGITS IN A NUMBER

This program counts how many digits
in a number are prime digits.

Prime digits: 2, 3, 5, 7

Program Logic:
1) Take a number from the user.
2) Extract each digit using % operator.
3) Check if the digit is prime.
4) If prime → increase count.
5) Repeat for all digits.
6) Print the total number of prime digits.

Example:
Number → 2358
Prime digits → 2, 3, 5 → Count = 3
*/

import java.util.*;
public class PrimeDigitsInANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int temp=num;
        int count=0;

        while(temp!=0){
            int digit=temp%10;
            int newCount=0;
            for(int i=1;i<=digit;i++){
                if(digit%i==0)
                    newCount++;
            }

            if(newCount==2)
                count++;
            
            temp/=10;
        }

        if(count==0)
            System.out.println(num + " does not contain any prime digits.");
        else
            System.out.println(num + " contains " + count + " prime digits.");
    }
}

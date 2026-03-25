/*
STRING PALINDROME PROGRAM

A Palindrome string is a word that
reads the same forward and backward.

Example:
"madam" → Palindrome

Program Logic:
1) Take a string from the user.
2) Compare characters from start and end.
3) Loop until half of the string.
4) If any characters are not equal → Not palindrome.
5) If all match → Palindrome.

This checks the string without reversing it.
*/

import java.util.Scanner;

public class StringPalindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str=sc.next();

        boolean flag=true;

        for(int i=0;i<(str.length()/2);i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                flag=false;
            }
        }

        if(flag)
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");
    }
}

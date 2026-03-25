/*
STRING REVERSE PROGRAM

This program reverses a given string.

Program Logic:
1) Take a string input from the user.
2) Start a loop from the last character to the first.
3) Print each character in reverse order.
4) The output will be the reversed string.

Example:
Input: "hello"
Output: "olleh"
*/

import java.util.Scanner;

public class StringReverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str=sc.next();

        System.out.print("After Reverse: ");
        
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }

    }
}

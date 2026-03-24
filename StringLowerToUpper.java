/*
STRING LOWERCASE TO UPPERCASE

This program converts a string
from lowercase to uppercase.

Program Logic:
1) Take a string as input from user.
2) Display the original string.
3) Use toUpperCase() method to convert it.
4) Print the converted uppercase string.

toUpperCase() is a built-in method
used for string conversion.
*/

import java.util.Scanner;

public class StringLowerToUpper{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a String: ");
            String str=sc.next();
            System.out.println("Before conveted into uppercase: "+str);
            String toUpper=str.toUpperCase();
            System.out.println("Converted into UpperCase: "+toUpper);
        }
    }
}

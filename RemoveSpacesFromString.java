/*
REMOVE SPACES FROM STRING

This program removes all spaces
from a given string.

Program Logic:
1) Take a full string as input from user.
2) Traverse each character in the string.
3) Check if the character is not a space (' ').
4) If not a space, add it to a new string.
5) Print the original and modified string.

Example:
Input: "Hello Java World"
Output: "HelloJavaWorld"
*/

import java.util.Scanner;

public class RemoveSpacesFromString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter something: ");
            String str = sc.nextLine();
            String result="";
            
            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                if (currentChar != ' ') {
                    result += currentChar;
                }
            }
            
            System.out.println("Original String: " + str);
            System.out.println("String without spaces: " + result);
        }
    }
}

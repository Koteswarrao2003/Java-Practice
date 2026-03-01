/*
COUNT FREQUENCY OF A CHARACTER IN STRING

This program finds how many times
a specific character appears in a string.

Program Logic:
1) Take a full string as input from user.
2) Take a character to search.
3) Traverse the string one character at a time.
4) Compare each character with the target character.
5) If matched → increase count.
6) Print the total frequency.

Scanner is used to take input from user.
*/

import java.util.Scanner;

public class CountFrequencyOfCharcters {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter something: ");
            String str = sc.nextLine();
            System.out.print("Enter a character to find frequency: ");
            char targetChar = sc.next().charAt(0);
            int count = 0;
            
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == targetChar) {
                    count++;
                }
            }
            
            System.out.println("The character '" + targetChar + "' appears " + count + " times in the string.");
        }
    }
}

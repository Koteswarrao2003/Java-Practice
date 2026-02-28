/*
COUNT EACH CHARACTER IN A STRING

This program counts how many times
each character appears in a string.

Program Logic:
1) Take a string as input from user.
2) Convert the string into a character array.
3) Pick one character at a time.
4) Compare it with remaining characters.
5) If same character is found:
   - Increase count
   - Replace duplicate with '0' 
     (to avoid counting again)
6) Print character and its count.

Note:
'0' is used as a marker to skip
already counted characters.
*/

import java.util.Scanner;

public class CountEachCharacterInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input=sc.nextLine();
        char ch[]=input.toCharArray();

        for(int i=0;i<ch.length;i++) {
            char currentChar = ch[i];
            int count = 0;

            if(ch[i] == '0') {
               continue;
            }

            for(int j=i+1;j<ch.length;j++) {
                if(currentChar == ch[j]) {
                    count++;
                    ch[j] = '0'; 
                }
            }
            System.out.println(currentChar + " : " + (count + 1));
        }
    }
}

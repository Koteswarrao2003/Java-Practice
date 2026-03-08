/*
PRINT FIRST CHARACTER OF EACH WORD

This program extracts the first letter
of every word in a sentence.

Program Logic:
1) Take a sentence as input from the user.
2) Split the sentence into words using split(" ").
3) Convert each word to uppercase.
4) Take the first character of each word.
5) Combine all first characters into a new string.
6) Print the result.

Example:
Input: "hello java world"
Output: HJW
*/

import java.util.*;

public class FirstCharacterInEachWord{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a something:");
        String str=sc.nextLine();
        String s[]=str.split(" ");
        
        String words="";
        
        for(String temp:s){
            char ch[]=temp.toUpperCase().toCharArray();
            words+=ch[0];
        }

        System.out.println(words);
    }
}

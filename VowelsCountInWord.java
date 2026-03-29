/*
COUNT VOWELS IN A WORD

This program counts the number of vowels
in a given word.

Program Logic:
1) Take a word as input from the user.
2) Convert the word to lowercase.
3) Convert the string into a character array.
4) Check each character:
   - If it is a vowel (a, e, i, o, u)
     then increase the count.
5) Print the total number of vowels.

Example:
Input: "hello"
Output: 2 vowels (e, o)
*/

import java.util.Scanner;

public class VowelsCountInWord{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String str=sc.next();

        char ch[]=str.toLowerCase().toCharArray();

        int count=0;

        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                count++;
            }
        }

        System.out.println(str+" contains "+count+" vowels");
    }
}

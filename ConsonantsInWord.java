/*
COUNT CONSONANTS IN A WORD

This program counts the number of consonants
in a given word.

Program Logic:
1) Take a word as input from user.
2) Convert the word to lowercase.
3) Convert the string into a character array.
4) Check each character:
   - If it is not a vowel (a, e, i, o, u),
     then it is counted as a consonant.
5) Print the total number of consonants.

Note:
This program assumes input contains only alphabets.
*/

import java.util.Scanner;

public class ConsonantsInWord{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String str=sc.next();

        char ch[]=str.toLowerCase().toCharArray();

        int count=0;

        for (int i = 0; i < ch.length; i++) {
            if(!(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')){
                count++;
            }
        }

        System.out.println(str+" contains "+count+" consonants");
    }
}

/*
COUNT WORDS IN A SENTENCE

This program counts the number of words
in a given sentence.

Program Logic:
1) Take a full sentence as input from user.
2) Use split(" ") method to separate words
   based on space.
3) Store the words in a String array.
4) Print the length of the array,
   which represents the number of words.

Note:
Words are separated based on spaces.
*/

import java.util.*;

public class CountWordsInSentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter something:");
        String sentence = sc.nextLine();
        String []words=sentence.split(" ");
        System.out.println("Number of words in the sentence: " + words.length);
    }
}

/*
ANAGRAM PROGRAM

This program checks whether two words are anagrams.

Anagram means:
Both words contain the same letters in different order.
Example: "listen" and "silent"

Program Logic:
1) Take two words as input from the user.
2) First check the length of both words.
   - If lengths are different → Not anagrams.
3) Convert both words to lowercase 
   (so case does not affect comparison).
4) Convert strings into character arrays.
5) Sort both character arrays.
6) Compare both sorted arrays using Arrays.equals().
   - If equal → Both are anagrams.
   - If not equal → Both are not anagrams.

Important:
Sorting helps to arrange letters in same order
so comparison becomes easy.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first name: ");
        String str1=sc.next();
        System.out.print("Enter second name: ");
        String str2=sc.next();

        if(str1.length()!=str2.length())
            System.out.println("Both are not anagrams");
        else{
            char arr1[]=str1.toLowerCase().toCharArray();
            char arr2[]=str2.toLowerCase().toCharArray();

            for(int i=0;i<arr1.length;i++){
                for(int j=i+1;j<arr1.length;j++){
                    if(arr1[i]>arr1[j]){
                        char temp=arr1[i];
                        arr1[i]=arr1[j];
                        arr1[j]=temp;
                    }
                }
            }

            for(int i=0;i<arr2.length;i++){
                for(int j=i+1;j<arr2.length;j++){
                    if(arr2[i]>arr2[j]){
                        char temp=arr2[i];
                        arr2[i]=arr2[j];
                        arr2[j]=temp;
                    }
                }
            }

            if(Arrays.equals(arr1, arr2))
                System.out.println("Both are anagrams");
            else
                System.out.println("Both are not anagrams");

        }

    }
}

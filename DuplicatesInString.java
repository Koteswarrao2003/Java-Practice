/*
FIND DUPLICATE CHARACTERS IN STRING

This program finds duplicate characters
in a given string.

Program Logic:
1) Take a string input from user.
2) Convert the string into a character array.
3) Use two nested loops:
   - Compare each character with every other character.
4) If same character is found at different index,
   it is a duplicate.
5) Print the duplicate character.

Note:
This basic method may print duplicates multiple times.
*/

import java.util.Scanner;

public class DuplicatesInString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        String str=sc.next();
        char arr[]=str.toCharArray();
     

        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    flag=true;
                    break;
                }
            }

            if(flag)
                System.out.println(arr[i]);
        }

    }
}

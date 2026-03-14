/*
FIND MISSING NUMBERS IN ARRAY

This program finds missing numbers
from a sequence of numbers.

Program Logic:
1) Take array size and elements from the user.
2) Assume the array contains numbers in order
   with some numbers missing.
3) Get the last number of the array as the range.
4) Loop from 1 to that number.
5) Compare each value with array elements.
6) If a number is not found in the array,
   print it as a missing number.

Example:
Array → 1 2 4 6
Missing numbers → 3 5
*/

import java.util.*;

public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] numbers=new int[size];
        System.out.print("Enter " + size + " integers: ");
        for(int i=0;i<size;i++) {
            numbers[i]=sc.nextInt();
        }
       
        int n=numbers[numbers.length-1];
        int index=0;

        System.out.print("Missing numbers are: ");
        for(int i=1;i<=n;i++) {
            if(index<numbers.length && numbers[index]==i){
                index++;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}

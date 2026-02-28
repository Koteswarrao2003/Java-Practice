/*
COMMON ELEMENTS IN TWO ARRAYS

This program finds common elements 
between two integer arrays.

Program Logic:
1) Store elements of first array in a HashSet.
2) Traverse the second array.
3) For each element, check if it exists in the HashSet.
4) If it exists → It is a common element.
5) Print the common element and remove it 
   (to avoid duplicate printing).

HashSet is used because:
- It stores unique elements.
- Searching is fast (O(1) average time).
*/

import java.util.HashSet;

public class CommonElementsInTwoArrays {
     public static void main(String[] args) { 
        int[] array1 = {1, 2, 3, 4, 5}; 
        int[] array2 = {4, 5, 6, 7, 8}; 

        HashSet<Integer> set=new HashSet<>();

        for(int a:array1){
            set.add(a);
        }

        System.out.println("Common elements in the two arrays:"); 
        for(int num:array2){
            if(set.contains(num)){
                System.out.println(num+" ");
                set.remove(num);
            }
        }
    }
}

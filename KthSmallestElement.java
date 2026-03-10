/*
KTH SMALLEST ELEMENT IN ARRAY

This program finds the Kth smallest element
in an array.

Program Logic:
1) Take array size and elements from the user.
2) Sort the array using Arrays.sort().
3) Ask the user for the value of k.
4) The Kth smallest element will be at index (k - 1).
5) Print the result.

Example:
Array → [7, 2, 9, 4, 1]
Sorted → [1, 2, 4, 7, 9]

If k = 3 → 3rd smallest element is 4.
*/

import java.util.*;
public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter the element "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.print("Enter the value of k: ");
        int k=sc.nextInt();

        if(k>0 && k<=size){
            System.out.println("The "+k+"rd smallest element is: "+arr[k-1]);
        } else {
            System.out.println("Invalid value of k.");
        }
    }
  
}

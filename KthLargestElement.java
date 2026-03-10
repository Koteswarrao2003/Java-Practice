/*
KTH LARGEST ELEMENT IN ARRAY

This program finds the Kth largest element
in an array.

Program Logic:
1) Take array size and elements from the user.
2) Sort the array using Arrays.sort().
3) Ask the user for the value of k.
4) The Kth largest element is at index (size - k).
5) Print the result.

Example:
Array → [3, 5, 1, 8, 2]
Sorted → [1, 2, 3, 5, 8]

If k = 2 → 2nd largest element is 5.
*/

import java.util.*;
public class KthLargestElement {
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
            System.out.println("The "+k+"rd largest element is: "+arr[size-k]);
        } else {
            System.out.println("Invalid value of k.");
        }
    }
  
}

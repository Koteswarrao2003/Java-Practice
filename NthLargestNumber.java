/*
NTH LARGEST NUMBER IN ARRAY

This program finds the Nth largest element
in an array.

Program Logic:
1) Take the size of the array and elements from the user.
2) Sort the array using nested loops.
3) Ask the user which largest element is required.
4) After sorting, the Nth largest element will be
   at index (array length - N).
5) Print the result.

Example:
Array → 5, 2, 9, 1
Sorted → 1, 2, 5, 9

If N = 2 → 2nd largest element is 5.
*/

import java.util.*;

public class NthLargestNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of the array: ");
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            
            System.out.print("Which largest element you want: ");
            int large = sc.nextInt();
            
            if (large > arr.length || large <= 0) {
                System.out.println("Choose value between 1 and " + arr.length);
            } else {
                System.out.println(large + " largest element is: " + arr[arr.length - large]);
            }
        }
    }
}

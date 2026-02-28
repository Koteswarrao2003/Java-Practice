/*
COUNT EVEN AND ODD NUMBERS IN ARRAY

This program counts how many even and odd
numbers are present in an array.

Program Logic:
1) Take the size of the array from user.
2) Read elements into the array.
3) Traverse the array using a loop.
4) Check each number:
   - If number % 2 == 0 → Even
   - Else → Odd
5) Count and print total even and odd numbers.

Scanner is used to take input from user.
*/

import java.util.Scanner;

public class CountEvenOddInArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] numbers = new int[size];
            
            System.out.print("Enter " + size + " integers:");
            for (int i = 0; i < size; i++) {
                numbers[i] = sc.nextInt();
            }
            
            int evenCount = 0;
            int oddCount = 0;
            
            for (int number : numbers) {
                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            
            System.out.println("Total Even Numbers: " + evenCount);
            System.out.println("Total Odd Numbers: " + oddCount);
        }
    }
}

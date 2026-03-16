/*
PRINT N TO 1 NUMBERS WITHOUT USING LOOPS

This program prints numbers from N to 1
without using loops.

Program Logic:
1) Take a number N from the user.
2) Use a recursive method to print numbers.
3) Print the current number.
4) Call the method again with (n - 1).
5) Stop when the number becomes 0.

This demonstrates recursion,
where a method calls itself repeatedly.
*/

import java.util.Scanner;
public class NToOneNumbersWithOutLoops{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        printNumbers(n);
    }

    public static void printNumbers(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printNumbers(n-1);
    }
}

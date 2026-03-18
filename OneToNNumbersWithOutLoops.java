/*
PRINT 1 TO N NUMBERS WITHOUT USING LOOPS

This program prints numbers from 1 to N
without using loops.

Program Logic:
1) Take a number N from the user.
2) Use a recursive method.
3) First call the method with (n - 1).
4) Then print the current number.
5) Stop when n becomes 0.

This prints numbers in increasing order.

This demonstrates recursion,
where a method calls itself.
*/

import java.util.Scanner;
public class OneToNNumbersWithOutLoops{
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
        printNumbers(n-1);
        System.out.print(n+" ");
    }
}

/*
FIBONACCI SERIES PROGRAM

Fibonacci series is a sequence where
each number is the sum of the previous two numbers.

Example:
0 1 1 2 3 5 8 13 ...

Program Logic:
1) Start with first two numbers: 0 and 1.
2) Print the first number.
3) Find the next number by adding previous two numbers.
4) Update the values and repeat.
5) Continue until required number of terms are printed.
*/

public class Fibonacci{
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=10;

        while(n!=0){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
            n--;
        }
    }
}

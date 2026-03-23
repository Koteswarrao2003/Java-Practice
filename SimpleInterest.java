/*
SIMPLE INTEREST PROGRAM

This program calculates simple interest.

Formula:
Simple Interest = (Principal × Rate × Time) / 100

Program Logic:
1) Take principal amount, rate of interest, and time from user.
2) Apply the simple interest formula.
3) Calculate the result.
4) Print the simple interest.

Used in basic financial calculations.
*/

import java.util.*;
public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Principal Amount: ");
        double p=sc.nextDouble();
        System.out.print("Rate of Interest: ");
        double r=sc.nextDouble();
        System.out.print("Time in Years: ");
        double t=sc.nextDouble();

        double si=(p*t*r)/100;
        System.out.println("Simple Interest: "+si);

    }
}

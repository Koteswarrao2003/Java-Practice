/*
GREATEST COMMON DIVISOR (GCD)

GCD is the largest number that divides
two numbers without leaving a remainder.

Example:
GCD of 12 and 18 → 6

Program Logic:
1) Take two numbers from the user.
2) Find the smaller number between them.
3) Use a loop from 1 to the smaller number.
4) Check if both numbers are divisible by i.
5) If yes, store i as GCD.
6) The last stored value will be the final GCD.
*/

import java.util.Scanner;

public class GCD{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int first=sc.nextInt();
        System.out.print("Enter Second Number: ");
        int second=sc.nextInt();

        int min=(first<second)?first:second;
        int gcd=0;

        for(int i=1;i<=min;i++){
            if(first%i==0 && second%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD: "+gcd);
    }
}

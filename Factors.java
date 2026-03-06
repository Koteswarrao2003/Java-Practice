/*
FACTORS OF A NUMBER

Factors are numbers that divide a given
number completely without leaving a remainder.

Example:
Factors of 6 → 1, 2, 3, 6

Program Logic:
1) Take a number as input from the user.
2) Use a loop from 1 to the given number.
3) Check if the number is divisible by i (num % i == 0).
4) If divisible, print that number as a factor.
*/

import java.util.*;
public class Factors{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num=sc.nextInt();
            
            System.out.print(num+" Factors are: ");
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    System.out.print(i+" ");
                }
            }
        }
        
    }
}

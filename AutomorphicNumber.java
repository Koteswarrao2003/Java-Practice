/*
AUTOMORPHIC NUMBER PROGRAM

An Automorphic number is a number whose square
ends with the same number.

Example:
5 → 5² = 25  (ends with 5)
6 → 6² = 36  (ends with 6)

Program Logic:
1) Take a number from user.
2) Find its square.
3) Count how many digits are in the number.
4) Create a value like 10, 100, 1000 based on digit count.
5) Get the last digits of the square using modulus (%).
6) If last digits equal the original number → Automorphic.
   Otherwise → Not Automorphic.
*/

import java.util.*;
public class AutomorphicNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int square=a*a;
        int num=a;

        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        String checking="1";
        for(int i=0;i<count;i++){
            checking=checking+"0";
        }

        int check=Integer.parseInt(checking);
        int result=square%check;
        if(result==a)
            System.out.println(a+" is an Automorphic Number");
        else
            System.out.println(a+" is not an Automorphic Number");
    }
}

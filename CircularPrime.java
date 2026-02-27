/*
CIRCULAR PRIME PROGRAM

A Circular Prime is a number where:
The number and all its digit rotations are prime.

Example:
197 → 197, 971, 719
All are prime numbers → So it is a Circular Prime.

Program Logic:
1) Take a number from user.
2) First check if the number itself is prime.
3) Convert number into String to rotate digits.
4) Rotate digits one by one.
5) Check each rotated number is prime.
6) If all rotations are prime → Circular Prime.
   Otherwise → Not Circular Prime.
*/

import java.util.*;
public class CircularPrime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int fCount=0;
        int temp=num;
        boolean flag=true;

        while(temp!=0){
            fCount++;
            temp/=10;
        }


        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0)
                count++;
        }

        if(count==2){
            String strNum=Integer.toString(num);
            while(fCount!=0){
                strNum=strNum.substring(1)+strNum.charAt(0);
                int newNum=Integer.parseInt(strNum);
                int newCount=0;
                for(int i=1;i<=newNum;i++){
                    if(newNum%i==0)
                        newCount++;
                }
                if(newCount!=2){
                    flag=true;
                    break;
                }
                fCount--;
            }
        }

        if(flag)
            System.out.println(num + " is a Circular Prime.");
        else
            System.out.println(num + " is not a Circular Prime.");
    }
}

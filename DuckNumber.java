/*
DUCK NUMBER PROGRAM

A Duck Number is a number that contains
at least one zero (0),
but the zero should not be at the beginning.

Example:
1023 → Duck Number (contains 0 inside)
0123 → Not a Duck Number (starts with 0)

Program Logic:
1) Take a number from user.
2) Convert number into String.
3) Check if it contains '0'.
4) Ensure the first digit is not '0'.
5) If both conditions are true → Duck Number.
   Otherwise → Not a Duck Number.
*/

import java.util.*;
public class DuckNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        String strNum=Integer.toString(num);
        if(strNum.contains("0")){
            if(strNum.charAt(0)!='0')
                System.out.println(num + " is a Duck Number.");
            else
                System.out.println(num + " is not a Duck Number.");
        }else
            System.out.println(num + " is not a Duck Number.");
    }
}

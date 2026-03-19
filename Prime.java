/*
PRIME NUMBER PROGRAM

A Prime Number is a number that has
only two factors: 1 and itself.

Example:
7 → factors are 1 and 7 → Prime

Program Logic:
1) Take a number.
2) Count how many numbers divide it exactly.
3) If count == 2 → Prime number.
4) Otherwise → Not a Prime number.

This method checks divisibility
from 1 to the given number.
*/

public class Prime{
    public static void main(String[] args) {
        int count=0;
        int num=17;

        for(int i=1;i<=num;i++){
            if(num%i==0)
                count++;
        }

        if(count==2)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}

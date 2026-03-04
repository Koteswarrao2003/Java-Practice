/*
PRINT EVEN NUMBERS FROM 1 TO 100

This program prints all even numbers
between 1 and 100.

Program Logic:
1) Use a loop from 1 to 100.
2) Check each number using (number % 2 == 0).
3) If the condition is true, the number is even.
4) Print the even number.

Even numbers are divisible by 2.
*/

public class EvenNumbers{
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}

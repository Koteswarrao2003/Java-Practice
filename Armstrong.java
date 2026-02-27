/*
ARMSTRONG NUMBER PROGRAM

An Armstrong number is a number where:
Sum of each digit raised to the power of 
total number of digits is equal to the number itself.

Example:
153 → 1³ + 5³ + 3³ = 153

Program Logic:
1) Store the original number.
2) Count how many digits are in the number.
3) Take each digit one by one.
4) Raise each digit to the power of total digits.
5) Add all the values.
6) If sum equals original number → Armstrong number.
   Otherwise → Not an Armstrong number.
*/

public class Armstrong{
    public static void main(String[] args) {
        int num=153;
        int n=num;
        int count=0;

        while(num!=0){
            num/=10;
            count++;
        }

        int temp=n;

        int sum=0;
        while(n!=0){
            int digit=n%10;
            int value=1;
            for(int i=1;i<=count;i++){
                value*=digit;
            }
            sum+=value;
            n/=10;
        }

        if(sum==temp)
            System.out.println(temp+" is an Armstrong Number");
        else
            System.err.println("Not an Armstrong Number");

    }
}

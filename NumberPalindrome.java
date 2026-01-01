import java.util.Scanner;

public class NumberPalindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;

        while(num!=0){
            int digit=num%10;
            sum=sum*10+digit;
            num/=10;
        }

        if(temp==sum)
            System.out.println(temp+" is a palindrome");
        else
            System.out.println(temp+" is not a palindrome");
    }
}
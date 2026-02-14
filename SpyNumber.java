import java.util.*;
public class SpyNumber{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        int product=1;

        while(num!=0){
            int digit=num%10;
            sum+=digit;
            product*=digit;
            num/=10;
        }

        if(sum==product)
            System.out.println(temp+" is a Spy number.");
        else
            System.out.println(temp+" is not a Spy number.");

    }
}
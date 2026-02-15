import java.util.*;
public class NeonNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int square=num*num;
        int sum=0;
        int temp=square;

        while(temp!=0){
            int digit=temp%10;
            sum+=digit;
            temp/=10;
        }

        if(sum==num)
            System.out.println(num + " is a Neon Number.");
        else
            System.out.println(num + " is not a Neon Number.");
    }
}
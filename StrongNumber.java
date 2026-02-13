import java.util.Scanner;

public class StrongNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;

        while(num!=0){
            int digit=num%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact*=i;
            }
            sum+=fact;
            num/=10;
        }

        if(temp==sum)
            System.out.println(temp+" is a strong number.");
        else
            System.out.println(temp+" is not a strong number.");
    }
}
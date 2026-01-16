
import java.util.Scanner;

public class GCD{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int first=sc.nextInt();
        System.out.print("Enter Second Number: ");
        int second=sc.nextInt();

        int min=(first<second)?first:second;
        int temp=0;

        for(int i=1;i<=min;i++){
            if(first%i==0 && second%i==0){
                temp=i;
            }
        }
        System.out.println("GCD: "+temp);
    }
}
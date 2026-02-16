import java.util.*;
public class PrimeDigitsInANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int temp=num;
        int count=0;

        while(temp!=0){
            int digit=temp%10;
            int newCount=0;
            for(int i=1;i<=digit;i++){
                if(digit%i==0)
                    newCount++;
            }

            if(newCount==2)
                count++;
            
            temp/=10;
        }

        if(count==0)
            System.out.println(num + " does not contain any prime digits.");
        else
            System.out.println(num + " contains " + count + " prime digits.");
    }
}
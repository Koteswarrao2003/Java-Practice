import java.util.*;
public class CircularPrime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int fCount=0;
        int temp=num;
        boolean flag=true;

        while(temp!=0){
            fCount++;
            temp/=10;
        }


        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0)
                count++;
        }

        if(count==2){
            String strNum=Integer.toString(num);
            while(fCount!=0){
                strNum=strNum.substring(1)+strNum.charAt(0);
                int newNum=Integer.parseInt(strNum);
                int newCount=0;
                for(int i=1;i<=newNum;i++){
                    if(newNum%i==0)
                        newCount++;
                }
                if(newCount!=2){
                    flag=true;
                    break;
                }
                fCount--;
            }
        }

        if(flag)
            System.out.println(num + " is a Circular Prime.");
        else
            System.out.println(num + " is not a Circular Prime.");
    }
}
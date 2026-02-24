import java.util.*;
public class AutomorphicNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int square=a*a;
        int num=a;

        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        String checking="1";
        for(int i=0;i<count;i++){
            checking=checking+"0";
        }

        int check=Integer.parseInt(checking);
        int result=square%check;
        if(result==a)
            System.out.println(a+" is an Automorphic Number");
        else
            System.out.println(a+" is not an Automorphic Number");
    }
}
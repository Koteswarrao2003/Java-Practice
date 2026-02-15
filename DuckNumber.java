import java.util.*;
public class DuckNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        String strNum=Integer.toString(num);
        if(strNum.contains("0")){
            if(strNum.charAt(0)!='0')
                System.out.println(num + " is a Duck Number.");
            else
                System.out.println(num + " is not a Duck Number.");
        }else
            System.out.println(num + " is not a Duck Number.");
    }
}
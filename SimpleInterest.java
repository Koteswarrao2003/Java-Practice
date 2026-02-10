import java.util.*;
public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Principal Amount: ");
        double p=sc.nextDouble();
        System.out.print("Rate of Interest: ");
        double r=sc.nextDouble();
        System.out.print("Time in Years: ");
        double t=sc.nextDouble();

        double si=(p*t*r)/100;
        System.out.println("Simple Interest: "+si);

    }
}
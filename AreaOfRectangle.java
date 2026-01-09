import java.util.Scanner;

public class AreaOfRectangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length: ");
        double length=sc.nextDouble();
        System.out.print("Enter Width: ");
        double width=sc.nextDouble();
        double area=length*width;
        System.out.println("Area of Rectangle is: "+area);

    }
}

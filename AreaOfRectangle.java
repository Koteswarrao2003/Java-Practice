/*
AREA OF RECTANGLE PROGRAM

This program calculates the area of a rectangle.

Formula:
Area = Length × Width

Program Steps:
1) Take length and width as input from the user.
2) Multiply length and width.
3) Store the result in a variable called area.
4) Print the area.

We use double data type to allow decimal values.
*/

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

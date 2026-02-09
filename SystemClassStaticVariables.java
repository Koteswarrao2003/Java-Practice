import  java.util.*;
public class SystemClassStaticVariables{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Taking input: ");
        System.out.print("Enter something: ");
        String str=sc.nextLine();
        System.out.println();
        System.out.println("Printing: ");
        System.out.println(str);
        System.out.println();
        System.out.println("Error: ");
        System.err.println("Hello World");

    }
}
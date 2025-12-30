import java.util.Scanner;

public class StringLowerToUpper{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a String: ");
            String str=sc.next();
            System.out.println("Before conveted into uppercase: "+str);
            String toUpper=str.toUpperCase();
            System.out.println("Converted into UpperCase: "+toUpper);
        }
    }
}
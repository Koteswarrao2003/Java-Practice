import java.util.Scanner;

public class StringUpperToLower{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a String: ");
            String str=sc.next();
            System.out.println("Before conveted into lowercase: "+str);
            String toLower=str.toLowerCase();
            System.out.println("Converted into LowerCase: "+toLower);
        }
    }
}
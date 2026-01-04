import java.util.Scanner;

public class CelsiusToFarenheit{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter celcius values: ");
            double celsius=sc.nextDouble();
            double farenheit=(celsius*9/5)+32;
            System.out.println(celsius+" is equal to "+farenheit);
        }
    }
}

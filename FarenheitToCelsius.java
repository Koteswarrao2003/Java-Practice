import java.util.Scanner;

public class FarenheitToCelsius{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)) {
            System.out.print("Enter farenheit value: ");
            double farenheit=sc.nextDouble();
            double celsius=(farenheit-32)*5/9;
            System.out.println(farenheit+" is equal to "+celsius);
        } catch (Exception e) {
        }
    }
}
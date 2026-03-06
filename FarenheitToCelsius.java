/*
FAHRENHEIT TO CELSIUS CONVERSION

This program converts temperature
from Fahrenheit to Celsius.

Formula:
Celsius = (Fahrenheit − 32) × 5/9

Program Logic:
1) Take Fahrenheit value as input from user.
2) Apply the conversion formula.
3) Calculate the Celsius value.
4) Print the result.

Scanner is used to read input from the user.
*/

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

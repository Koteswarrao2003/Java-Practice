/*
CELSIUS TO FAHRENHEIT CONVERSION

This program converts temperature 
from Celsius to Fahrenheit.

Formula:
Fahrenheit = (Celsius × 9/5) + 32

Program Steps:
1) Take Celsius value as input from user.
2) Apply the conversion formula.
3) Print the Fahrenheit value.

Scanner is used to read input from user.
*/

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

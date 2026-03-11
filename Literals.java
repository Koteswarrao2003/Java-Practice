/*
LITERALS IN JAVA

Literals are fixed values assigned to variables in a program.

This program demonstrates different types of literals:

1) Integer Literals:
   - Decimal → 100
   - Binary → 0b1010
   - Octal → 012
   - Hexadecimal → 0xA

2) Floating Point Literals:
   - float → 10.5f
   - double → 99.99

3) Character Literal:
   - char → 'J'

4) String Literal:
   - "Java"

5) Boolean Literals:
   - true and false

6) Underscore Literal:
   - Used to make large numbers more readable (1_00_000)

The program prints all these literal values.
*/

public class Literals {
    public static void main(String[] args) {

        int decimal = 100;
        int binary = 0b1010;
        int octal = 012;
        int hexadecimal = 0xA;

        float floatLiteral = 10.5f;
        double doubleLiteral = 99.99;

        char charLiteral = 'J';
        String stringLiteral = "Java";

        boolean trueLiteral = true;
        boolean falseLiteral = false;

        int underscoreLiteral = 1_00_000;

        System.out.println(decimal);
        System.out.println(binary);
        System.out.println(octal);
        System.out.println(hexadecimal);
        System.out.println(floatLiteral);
        System.out.println(doubleLiteral);
        System.out.println(charLiteral);
        System.out.println(stringLiteral);
        System.out.println(trueLiteral);
        System.out.println(falseLiteral);
        System.out.println(underscoreLiteral);
    }
}

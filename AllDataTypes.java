/*
ALL DATA TYPES IN JAVA

This program shows different data types in Java.

1) byte, short, int, long → used to store whole numbers.
2) float, double → used to store decimal numbers.
3) char → used to store a single character.
4) boolean → used to store true or false value.
5) String → used to store text.
6) Array → used to store multiple values of same type.

In this program, we declare all data types
and print their values.
*/

public class AllDataTypes {
    public static void main(String[] args) {

        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 100000L;

        float f = 10.5f;
        double d = 99.99;

        char c = 'A';
        boolean flag = true;

        String str = "Hello Java";
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);
        System.out.println("String: " + str);
        System.out.println("Array first element: " + arr[0]);
    }
}

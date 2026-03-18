/*
PARSING IN JAVA

Parsing means converting data from one type
to another (usually from String to primitive types).

This program demonstrates:
1) Integer.parseInt() → converts String to int
2) Double.parseDouble() → converts String to double
3) Boolean.parseBoolean() → converts String to boolean

Program Logic:
1) Store values as Strings.
2) Convert them into respective data types.
3) Print the converted values.

This is useful when reading input from files,
user input, or APIs.
*/

public class Parsing {
    public static void main(String[] args) {
        String intVal="104";
        String doubleVal="54.22";
        String boolVale="false";

        int a=Integer.parseInt(intVal);
        double b=Double.parseDouble(doubleVal);
        boolean c=Boolean.parseBoolean(boolVale);

        System.out.println("Integer Value: "+a);
        System.out.println("Double Value: "+b);
        System.out.println("Boolean Value: "+c);
    }
}

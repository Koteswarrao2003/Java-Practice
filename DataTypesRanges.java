/*
DATA TYPES RANGES IN JAVA

This program displays the minimum and maximum
values of different primitive data types.

Program Logic:
1) Use wrapper classes like Byte, Short, Integer, 
   Float, Double, and Character.
2) Access their predefined constants:
   - MIN_VALUE → Smallest value
   - MAX_VALUE → Largest value
3) Print the range of each data type.

This helps to understand the storage limits
of different data types in Java.
*/

public class DataTypesRanges{
    public static void main(String[] args) {
        System.out.println("Byte Range:");
        System.out.println("Minimum Value:"+Byte.MIN_VALUE);
        System.out.println("Maximum Value:"+Byte.MAX_VALUE);

        System.out.println();

        System.out.println("Short Range:");
        System.out.println("Minimum Value:"+Short.MIN_VALUE);
        System.out.println("Maximum Value:"+Short.MAX_VALUE);

        System.out.println();

        System.out.println("Integer Range:");
        System.out.println("Minimum Value:"+Integer.MIN_VALUE);
        System.out.println("Maximum Value:"+Integer.MAX_VALUE);

        System.out.println();

        System.out.println("Float Range:");
        System.out.println("Minimum Value:"+Float.MIN_VALUE);
        System.out.println("Maximum Value:"+Float.MAX_VALUE);

        System.out.println();

        System.out.println("Double Range:");
        System.out.println("Minimum Value:"+Double.MIN_VALUE);
        System.out.println("Maximum Value:"+Double.MAX_VALUE);

        System.out.println();

        System.out.println("Character Range:");
        System.out.println("Minimum Value:"+Character.MIN_VALUE);
        System.out.println("Maximum Value:"+Character.MAX_VALUE);

    }
}

/*
SCANNER CLASS METHODS IN JAVA

This program demonstrates different
methods of the Scanner class used
to read input from the user.

Methods used:
1) nextByte()  → reads byte value
2) nextShort() → reads short value
3) nextInt()   → reads integer value
4) nextLong()  → reads long value
5) nextFloat() → reads float value
6) nextDouble()→ reads double value
7) next()      → reads a single word
8) nextLine()  → reads a full line of text

After reading all values,
the program prints them on the screen.
*/

import java.util.*;
public class MethodsOfScannerClass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Byte Value: ");
        byte a=sc.nextByte();
        System.out.print("Short Value:");
        short b=sc.nextShort();
        System.out.print("Integer Value: ");
        int c=sc.nextInt();
        System.out.print("Long Value: ");
        long d=sc.nextLong();
        System.out.print("Float Value: ");
        float e=sc.nextFloat();
        System.out.print("Double Value: ");
        double f=sc.nextDouble();
        System.out.println("String Single Word Value: ");
        String s=sc.next();
        System.out.println("String Complete Line: ");
        sc.nextLine();
        String str=sc.nextLine();

        System.out.println();

        System.out.println("Printing Values: ");
        System.out.println("Byte: "+a);
        System.out.println("Short: "+b);
        System.out.println("Integer: "+c);
        System.out.println("Long: "+d);
        System.out.println("Float: "+e);
        System.out.println("Double: "+f);
        System.out.println("String Single Word: "+s);
        System.out.println("String Complete Value: "+str);
    }
}

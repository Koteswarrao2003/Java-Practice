/*
SYSTEM CLASS STATIC VARIABLES

This program demonstrates different
static variables of the System class.

Program Logic:
1) System.in  → Used to take input (with Scanner).
2) System.out → Used to print normal output.
3) System.err → Used to print error messages.

Steps:
- Take input from user using Scanner.
- Print the input using System.out.
- Print an error message using System.err.

This shows how input, output, and error
streams work in Java.
*/

import  java.util.*;
public class SystemClassStaticVariables{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Taking input: ");
        System.out.print("Enter something: ");
        String str=sc.nextLine();
        System.out.println();
        System.out.println("Printing: ");
        System.out.println(str);
        System.out.println();
        System.out.println("Error: ");
        System.err.println("Hello World");

    }
}

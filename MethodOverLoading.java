/*
METHOD OVERLOADING IN JAVA

Method Overloading means having multiple methods
with the same name but different parameters.

In this program:
1) display(int x) → accepts an integer.
2) display(String str) → accepts a string.
3) display(int x, String str) → accepts both integer and string.

The correct method is called based on
the type and number of arguments passed.

This demonstrates compile-time polymorphism in Java.
*/

public class MethodOverLoading {
    
    public void display(int x) {
        System.out.println("Method called with integer: " + x);
    }

    public void display(String str) {
        System.out.println("Method called with string: " + str);
    }

    public void display(int x, String str) {
        System.out.println("Method called with integer: " + x + " and string: " + str);
    }

    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();
        obj.display(10);
        obj.display("Hello");
        obj.display(20, "World");
    }
}

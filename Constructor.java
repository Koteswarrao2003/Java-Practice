/*
CONSTRUCTOR OVERLOADING IN JAVA

This program demonstrates constructors in Java.

Constructor:
A constructor is a special method 
that is called when an object is created.
It is used to initialize variables.

In this program:
1) Parameterized Constructor:
   - Takes values for a and b.
   - Assigns them using 'this' keyword.

2) Default Constructor:
   - Assigns default values (0 and "default").

Method:
display() → Prints values of a and b.

In main():
- obj1 uses parameterized constructor.
- obj2 uses default constructor.

This is called Constructor Overloading
(same constructor name, different parameters).
*/

public class Constructor {
    int a;
    String b;

    public Constructor(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public Constructor() {
        this.a = 0;
        this.b = "default";
    }

    public void display() {
        System.out.println("a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
        Constructor obj1 = new Constructor(10, "Hello");
        obj1.display();
        
        Constructor obj2 = new Constructor();
        obj2.display();
    }
}

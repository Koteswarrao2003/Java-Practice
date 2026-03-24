/*
STRING INTERN METHOD IN JAVA

This program demonstrates the use of
intern() method in String.

Program Logic:
1) String str = "Hello"
   → Stored in String pool.

2) String s = new String("Hello")
   → Created in heap memory.

3) s.intern()
   → Moves reference to String pool.

Comparison:
- (str == s)
  → Now both refer to same object in pool → true

- str.equals(s)
  → Compares content → true

intern() ensures that strings share
the same memory reference in the pool.
*/

public class StringLiteralWithIntern{
    public static void main(String[] args) {
        String str="Hello";
        String s=new String("Hello");
        s=s.intern();
        System.out.println("Using == operator: "+(str==s));
        System.out.println("Using Equals Method: "+(str.equals(s)));
        
    }
}

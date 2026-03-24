/*
STRING LITERAL IN JAVA

This program demonstrates different ways
to create strings and compare them.

Program Logic:
1) String str = "Hello"
   → Stored in String pool.

2) String s = new String("Hello")
   → Creates a new object in heap memory.

3) char[] → Used to create string using characters.

Comparison:
- (str == s)
  → Compares memory locations (references).

- str.equals(s)
  → Compares actual content (values).

Result:
== → false (different objects)
equals() → true (same content)
*/

public class StringLiteral{
    public static void main(String[] args) {
        String str="Hello";
        String s=new String("Hello");
        char ch[]={'J', 'A', 'V', 'A'};

        System.out.println(str);
        System.out.println(s);
        System.out.println(ch);

        System.out.println("Double Equal Operator: "+(str==s));
        System.out.println("Equals Method: "+(str.equals(s)));
    }
}

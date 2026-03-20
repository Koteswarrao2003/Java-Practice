/*
STRING CONCATENATION IN JAVA

This program shows how + operator works
with numbers and strings.

Program Logic:
1) a + b + "Result"
   → First adds numbers, then concatenates string.

2) "Result: " + a + b
   → String comes first, so everything becomes string.
   → Values are concatenated, not added.

3) "Result: " + (a + b)
   → Brackets force addition first, then concatenate.

This demonstrates operator precedence
and string concatenation behavior in Java.
*/

public class PrintOutConcatenation{
    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println(a+b+" Result");
        System.out.println("Result: "+a+b);
        System.out.println("Result: "+(a+b));
    }
}

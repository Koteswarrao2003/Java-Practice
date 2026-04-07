/*
WRAPPER CLASSES IN JAVA

Wrapper classes are used to convert
primitive data types into objects.

Examples:
byte → Byte
short → Short
int → Integer
long → Long
float → Float
double → Double
char → Character
boolean → Boolean

Program Logic:
1) Declare wrapper class variables.
2) Assign values (auto-boxing).
3) Print all values.

Note:
- Wrapper classes allow primitives to be used as objects.
- Useful in collections (like ArrayList, HashMap).
*/

public class WrapperClasses{
    public static void main(String[] args) {
        Byte b=12;
        Short s=25;
        Integer i=642;
        Long l=9983l;
        Float f=43.2f;
        Double d=53.56d;
        Character ch='k';
        String str="Ram";
        Boolean bool=false;

        System.out.println("Byte value: "+b);
        System.out.println("Short value: "+s);
        System.out.println("Integer value: "+i);
        System.out.println("Long value: "+l);
        System.out.println("Float value: "+f);
        System.out.println("Double value: "+d);
        System.out.println("Character value: "+ch);
        System.out.println("String value: "+str);
        System.out.println("Boolean value: "+bool);
    }
}

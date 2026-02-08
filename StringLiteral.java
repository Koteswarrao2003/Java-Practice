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
public class StringLiteralWithIntern{
    public static void main(String[] args) {
        String str="Hello";
        String s=new String("Hello");
        s=s.intern();
        System.out.println("Using == operator: "+(str==s));
        System.out.println("Using Equals Method: "+(str.equals(s)));
        
    }
}
public class UnaryOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = -5;
        boolean flag = true;

        System.out.println("Initial value of a: " + a);
        System.out.println("Initial value of b: " + b);

        System.out.println("Unary plus of a: " + (+a));
        System.out.println("Unary minus of a: " + (-a));

        System.out.println("Pre-increment of a: " + (++a));
        System.out.println("Post-increment of a: " + (a++));
        System.out.println("Value of a after post-increment: " + a);

        System.out.println("Pre-decrement of b: " + (--b));
        System.out.println("Post-decrement of b: " + (b--));
        System.out.println("Value of b after post-decrement: " + b);

        System.out.println("Logical NOT of flag: " + (!flag));
    }
}

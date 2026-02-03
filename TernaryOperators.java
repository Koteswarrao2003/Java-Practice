public class TernaryOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;
        System.out.println("Maximum value: " + max);

        String result = (a % 2 == 0) ? "Even number" : "Odd number";
        System.out.println("a is an " + result);
    }
}

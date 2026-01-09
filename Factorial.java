import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            
            if (num < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
                return;
            }
            
            long fact = 1;
            
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println(num + " factorial is: " + fact);
        }
    }
}

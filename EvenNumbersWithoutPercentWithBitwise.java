
import java.util.Scanner;

public class EvenNumbersWithoutPercentWithBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Even numbers up to " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            if ((i & 1) == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
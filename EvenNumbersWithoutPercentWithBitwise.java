import java.util.Scanner;

public class EvenNumbersWithoutPercentWithBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a starting range: ");
        int start = sc.nextInt();
        System.out.print("Enter an ending range: ");
        int end = sc.nextInt();
        System.out.print("Even numbers from " + start + " to "+end+" are: ");
        for (int i = start; i <= end; i++) {
            if ((i & 1) == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
import java.util.Scanner;

public class EvenNumbersWithoutPercent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter a starting number: ");
        int end = sc.nextInt();
        System.out.print("Even numbers from " + start + " to "+end+" are: ");
        for (int i = start; i <= end; i++) {
            if((i/2)*2==i) { 
                System.out.print(i + " ");
            }
        }
    }
}
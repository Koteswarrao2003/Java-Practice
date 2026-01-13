import java.util.Scanner;

public class CountEvenOddInArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] numbers = new int[size];
            
            System.out.print("Enter " + size + " integers:");
            for (int i = 0; i < size; i++) {
                numbers[i] = sc.nextInt();
            }
            
            int evenCount = 0;
            int oddCount = 0;
            
            for (int number : numbers) {
                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            
            System.out.println("Total Even Numbers: " + evenCount);
            System.out.println("Total Odd Numbers: " + oddCount);
        }
    }
}
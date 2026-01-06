import java.util.*;

public class NthSmallestElement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of the array: ");
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            
            System.out.print("Which smallest element you want: ");
            int small = sc.nextInt();
            
            if (small <= 0 || small > arr.length) {
                System.out.println("Choose value between 1 and " + arr.length);
            } else {
                System.out.println(small + " smallest element is: " + arr[small - 1]);
            }
        }
    }
}

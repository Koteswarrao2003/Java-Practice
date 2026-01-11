
import java.util.Scanner;

public class CountFrequencyOfCharcters {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter something: ");
            String str = sc.nextLine();
            System.out.print("Enter a character to find frequency: ");
            char targetChar = sc.next().charAt(0);
            int count = 0;
            
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == targetChar) {
                    count++;
                }
            }
            
            System.out.println("The character '" + targetChar + "' appears " + count + " times in the string.");
        }
    }
}

import java.util.Scanner;

public class RemoveSpacesFromString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter something: ");
            String str = sc.nextLine();
            String result="";
            
            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                if (currentChar != ' ') {
                    result += currentChar;
                }
            }
            
            System.out.println("Original String: " + str);
            System.out.println("String without spaces: " + result);
        }
    }
}

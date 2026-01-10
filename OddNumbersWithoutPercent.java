
import java.util.Scanner;

public class OddNumbersWithoutPercent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter an ending number: ");
        int end = sc.nextInt();
        System.out.print("Odd numbers from " + start + " to "+end+" are: ");

        for(int i=start;i<=end;i++){
            if((i/2)*2!=i) { 
                System.out.print(i+" ");
            }
        }
    }
}   
import java.util.Scanner;
public class NToOneNumbersWithOutLoops{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        printNumbers(n);
    }

    public static void printNumbers(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printNumbers(n-1);
    }
}
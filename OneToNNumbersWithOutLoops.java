import java.util.Scanner;
public class OneToNNumbersWithOutLoops{
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
        printNumbers(n-1);
        System.out.print(n+" ");
    }
}
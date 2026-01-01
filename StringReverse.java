import java.util.Scanner;

public class StringReverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str=sc.next();

        System.out.print("After Reverse: ");
        
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }

    }
}
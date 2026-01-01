import java.util.Scanner;

public class StringPalindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str=sc.next();

        boolean flag=true;

        for(int i=0;i<(str.length()/2);i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                flag=false;
            }
        }

        if(flag)
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");
    }
}
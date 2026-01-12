
import java.util.Scanner;

public class VowelsCountInWord{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String str=sc.next();

        char ch[]=str.toLowerCase().toCharArray();

        int count=0;

        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                count++;
            }
        }

        System.out.println(str+" contains "+count+" vowels");
    }
}

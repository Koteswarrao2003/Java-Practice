
import java.util.Scanner;

public class CountEachCharacterInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input=sc.nextLine();
        char ch[]=input.toCharArray();

        for(int i=0;i<ch.length;i++) {
            char currentChar = ch[i];
            int count = 0;

            if(ch[i] == '0') {
               continue;
            }

            for(int j=i+1;j<ch.length;j++) {
                if(currentChar == ch[j]) {
                    count++;
                    ch[j] = '0'; 
                }
            }
            System.out.println(currentChar + " : " + (count + 1));
        }
    }
}
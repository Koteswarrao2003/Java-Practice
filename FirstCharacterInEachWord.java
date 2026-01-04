import java.util.*;

public class FirstCharacterInEachWord{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a something:");
        String str=sc.nextLine();
        String s[]=str.split(" ");
        
        String words="";
        
        for(String temp:s){
            char ch[]=temp.toUpperCase().toCharArray();
            words+=ch[0];
        }

        System.out.println(words);
    }
}
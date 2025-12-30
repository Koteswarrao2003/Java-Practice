import java.util.Arrays;
import java.util.Scanner;

public class Anagrams{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first name: ");
        String str1=sc.next();
        System.out.print("Enter second name: ");
        String str2=sc.next();

        if(str1.length()!=str2.length())
            System.out.println("Both are not anagrams");
        else{
            char arr1[]=str1.toLowerCase().toCharArray();
            char arr2[]=str2.toLowerCase().toCharArray();

            for(int i=0;i<arr1.length;i++){
                for(int j=i+1;j<arr1.length;j++){
                    if(arr1[i]>arr1[j]){
                        char temp=arr1[i];
                        arr1[i]=arr1[j];
                        arr1[j]=temp;
                    }
                }
            }

            for(int i=0;i<arr2.length;i++){
                for(int j=i+1;j<arr2.length;j++){
                    if(arr2[i]>arr2[j]){
                        char temp=arr2[i];
                        arr2[i]=arr2[j];
                        arr2[j]=temp;
                    }
                }
            }

            if(Arrays.equals(arr1, arr2))
                System.out.println("Both are anagrams");
            else
                System.out.println("Both are not anagrams");

        }

    }
}
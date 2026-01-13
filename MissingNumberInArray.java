import java.util.*;

public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] numbers=new int[size];
        System.out.print("Enter " + size + " integers: ");
        for(int i=0;i<size;i++) {
            numbers[i]=sc.nextInt();
        }
       
        int n=numbers[numbers.length-1];
        int index=0;

        System.out.print("Missing numbers are: ");
        for(int i=1;i<=n;i++) {
            if(index<numbers.length && numbers[index]==i){
                index++;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
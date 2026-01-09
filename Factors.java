import java.util.*;
public class Factors{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num=sc.nextInt();
            
            System.out.print(num+" Factors are: ");
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    System.out.print(i+" ");
                }
            }
        }
        
    }
}
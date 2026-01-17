
import java.util.*;

public class LCM{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of an array: ");
            int size=sc.nextInt();
            int[] numbers=new int[size];
            System.out.print("Enter " + size + " integers: ");
            for(int i=0;i<size;i++) {
                numbers[i]=sc.nextInt();
            }
            
            Arrays.sort(numbers);
            int lcm=numbers[numbers.length-1];
            
            while (true) {
                boolean flag=true;
                
                for(int i=0;i<numbers.length;i++){
                    if(lcm%numbers[i]!=0){
                        flag=false;
                        break;
                    }
                }
                
                if(flag){
                    break;
                }
                lcm+=numbers[numbers.length-1];
            }
            System.out.println("LCM: " +lcm);
        }
    }
}
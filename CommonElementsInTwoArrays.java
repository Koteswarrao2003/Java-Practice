
import java.util.HashSet;

public class CommonElementsInTwoArrays {
     public static void main(String[] args) { 
        int[] array1 = {1, 2, 3, 4, 5}; 
        int[] array2 = {4, 5, 6, 7, 8}; 

        HashSet<Integer> set=new HashSet<>();

        for(int a:array1){
            set.add(a);
        }

        System.out.println("Common elements in the two arrays:"); 
        for(int num:array2){
            if(set.contains(num)){
                System.out.println(num+" ");
                set.remove(num);
            }
        }
    }
}

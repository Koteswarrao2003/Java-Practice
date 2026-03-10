/*
LCM OF NUMBERS IN AN ARRAY

LCM (Least Common Multiple) is the smallest
number that is divisible by all given numbers.

Program Logic:
1) Take the size of the array and elements from the user.
2) Sort the array to get the largest number.
3) Start checking multiples of the largest number.
4) For each multiple, check if it is divisible by all numbers.
5) The first number that is divisible by all elements is the LCM.
6) Print the LCM.

Example:
Numbers → 4, 6
LCM → 12
*/

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

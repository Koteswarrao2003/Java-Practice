/*
FIND DUPLICATE ELEMENTS IN ARRAY

This program finds duplicate elements
in an integer array.

Program Logic:
1) Take array size from user.
2) Read all elements into the array.
3) Use two nested loops:
   - Compare each element with every other element.
4) If same value is found at different index,
   it is a duplicate.
5) Print the duplicate element.

Note:
This method may print duplicates multiple times.
It uses basic nested loop approach.
*/

import java.util.Scanner;

public class DuplicatesInArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter the "+i+" value: ");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            boolean flag=false;
            for(int j=0;j<size;j++){
                if(i!=j && arr[i]==arr[j]){
                    flag=true;
                    break;
                }
            }

            if(flag)
                System.out.println(arr[i]);
        }

    }
}

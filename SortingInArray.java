/*
SORTING ARRAY IN ASCENDING ORDER

This program sorts an array in ascending order
using a simple comparison method.

Program Logic:
1) Declare an array with values.
2) Use two nested loops:
   - Compare each element with remaining elements.
3) If current element is greater, swap the values.
4) Repeat until the array is sorted.
5) Print the sorted array.

This is a basic sorting approach
(similar to selection sort).
*/

public class SortingInArray{
    public static void main(String[] args) {
        int arr[]={2,55,-41,0,-9,77,726};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (int num : arr) {
            System.out.print(num+" ");
        }
    }
}

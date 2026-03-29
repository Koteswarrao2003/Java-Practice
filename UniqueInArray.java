/*
FIND UNIQUE ELEMENTS IN ARRAY

This program finds elements that appear
only once in the array.

Program Logic:
1) Traverse each element in the array.
2) Compare it with all other elements.
3) If the element is found again → not unique.
4) If it is not found anywhere else → unique element.
5) Print all unique elements.

Example:
Array → 1, 2, 1, 3, 2
Unique elements → 3
*/

public class UniqueInArray{
    public static void main(String[] args) {
        int arr[]={1,2,1,3,2,1,4,5,3,1};
        
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    flag=true;
                    break;
                }
            }

            if(!flag)
                System.out.print(arr[i]+" ");
        }
    }
}

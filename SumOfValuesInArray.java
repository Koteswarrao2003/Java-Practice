/*
SUM OF VALUES IN ARRAY

This program calculates the sum
of all elements in an array.

Program Logic:
1) Declare an array with values.
2) Initialize a variable (sum = 0).
3) Use for-each loop to iterate through array.
4) Add each element to the sum.
5) Print the final sum.

For-each loop makes iteration simple
and easy to understand.
*/

public class SumOfValuesInArray{
    public static void main(String[] args) {
        int arr[]={1,3,4,8,6,7,2,1,5,4};
        int sum=0;

        for (int a : arr) {
            sum+=a;
        }
        System.out.println("Sum is: "+sum);
    }
}

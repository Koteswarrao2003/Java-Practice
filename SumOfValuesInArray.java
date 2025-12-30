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
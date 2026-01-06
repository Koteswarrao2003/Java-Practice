import java.util.*;

public class NthLargestNumber{
    public static void main(String[] args) {
        int arr[]={5,6,2,7,1,4,7,96,3,5,82,4};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        Scanner sc=new Scanner(System.in);
        System.out.print("Which largest Element You want: ");
        int large=sc.nextInt();


        if(large>arr.length){
            System.out.println("Choose large element in the range of 1 to "+arr.length+" only");
        }else{
            System.out.print(large+" largest element is: ");
            System.out.println(arr[arr.length-large]);
        }

    }
}
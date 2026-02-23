import java.util.*;
public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter the element "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.print("Enter the value of k: ");
        int k=sc.nextInt();

        if(k>0 && k<=size){
            System.out.println("The "+k+"rd smallest element is: "+arr[k-1]);
        } else {
            System.out.println("Invalid value of k.");
        }
    }
  
}
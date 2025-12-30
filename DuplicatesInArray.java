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
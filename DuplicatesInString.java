import java.util.Scanner;

public class DuplicatesInString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        String str=sc.next();
        char arr[]=str.toCharArray()
     

        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=0;j<arr.length;j++){
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

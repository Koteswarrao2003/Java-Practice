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

            if(flag)
                System.out.print(arr[i]+" ");
        }
    }
}

public class Armstrong{
    public static void main(String[] args) {
        int num=153;
        int n=num;
        int count=0;

        while(num!=0){
            num/=10;
            count++;
        }

        int temp=n;

        int sum=0;
        while(n!=0){
            int digit=n%10;
            int value=1;
            for(int i=1;i<=count;i++){
                value*=digit;
            }
            sum+=value;
            n/=10;
        }

        if(sum==temp)
            System.out.println(temp+" is an Armstrong Number");
        else
            System.err.println("Not an Armstrong Number");

    }
}
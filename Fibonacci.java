public class Fibonacci{
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=10;

        while(n!=0){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
            n--;
        }
    }
}
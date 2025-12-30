public class UniqueInString{
    public static void main(String[] args) {
        String str="Welcome to India";
        char ch[]=str.toCharArray();

        for(int i=0;i<ch.length;i++){
            boolean flag=false;
            for(int j=0;j<ch.length;j++){
                if(i!=j && ch[i]==ch[j]){
                    flag=true;
                    break;
                }
            }

            if(!flag){
                System.out.print(ch[i]);
            }
        }

    }
}
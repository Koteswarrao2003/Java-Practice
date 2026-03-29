/*
FIND UNIQUE CHARACTERS IN STRING

This program prints characters that appear
only once in a string.

Program Logic:
1) Convert the string into a character array.
2) Traverse each character.
3) Compare it with all other characters.
4) If it appears more than once → not unique.
5) If it appears only once → unique character.
6) Print all unique characters.

Example:
Input: "hello"
Output: h e o
*/

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

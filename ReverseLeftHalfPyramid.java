/*
REVERSE LEFT HALF PYRAMID

This program prints a reverse left half
pyramid pattern using numbers.

Program Logic:
1) Set number of rows (n).
2) Loop from n to 1 (reverse order).
3) Print spaces (n - i) for alignment.
4) Print numbers from 1 to i in each row.
5) Move to next line after each row.

Example Output (n = 5):

12345
 1234
  123
   12
    1
*/

public class ReverseLeftHalfPyramid{
    public static void main(String[] args) {
        int n=5;
        
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

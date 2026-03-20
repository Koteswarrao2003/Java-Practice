/*
PYRAMID PATTERN PROGRAM

This program prints a pyramid shape
using '*' symbols.

Program Logic:
1) Set number of rows (n).
2) Use outer loop for rows.
3) Print spaces (n - i) for alignment.
4) Print stars (2*i - 1) in each row.
5) Move to next line after each row.

Example Output (n = 5):

    *
   ***
  *****
 *******
*********
*/

public class Pyramid{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

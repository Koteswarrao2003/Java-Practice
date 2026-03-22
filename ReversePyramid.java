/*
REVERSE PYRAMID PATTERN

This program prints an inverted pyramid
using '*' symbols.

Program Logic:
1) Loop from n to 1 (top to bottom).
2) Print spaces (n - i) for alignment.
3) Print stars (2*i - 1) in each row.
4) Move to next line after each row.

This forms a reverse pyramid shape.
*/

public class ReversePyramid{
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
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

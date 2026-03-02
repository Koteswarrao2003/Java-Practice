/*
DIAMOND PATTERN PROGRAM

This program prints a diamond shape
using '*' symbols.

Program Logic:

1) Set n = 5 (number of rows for top half).

2) First loop → Prints the upper triangle:
   - Print spaces (n - i)
   - Print stars (2*i - 1)

3) Second loop → Prints the lower triangle:
   - Print spaces (n - i)
   - Print stars (2*i - 1)

The combination of upper and lower
triangles forms a diamond shape.

This program demonstrates nested loops
and pattern printing logic.
*/

public class Diamond{
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

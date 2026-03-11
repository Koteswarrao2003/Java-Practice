/*
LEFT HALF PYRAMID PATTERN

This program prints a left half pyramid
pattern using numbers.

Program Logic:
1) Set the number of rows (n).
2) Use the first loop to control rows.
3) Print spaces to align the pyramid.
4) Print numbers from 1 to i in each row.
5) Move to the next line after each row.

Example Output (n = 5):

    1
   12
  123
 1234
12345
*/

public class LeftHalfPyramid{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
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

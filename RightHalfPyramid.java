/*
RIGHT HALF PYRAMID

This program prints a right half
pyramid pattern using numbers.

Program Logic:
1) Use outer loop from 1 to 5 (rows).
2) For each row, print numbers from 1 to i.
3) Increase the number of elements in each row.
4) Move to next line after each row.

Example Output:

1
12
123
1234
12345
*/

public class RightHalfPyramid{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

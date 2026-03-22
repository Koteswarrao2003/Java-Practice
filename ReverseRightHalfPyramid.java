/*
REVERSE RIGHT HALF PYRAMID

This program prints a reverse right half
pyramid using numbers.

Program Logic:
1) Start loop from 5 to 1.
2) For each row, print numbers from 1 to i.
3) Reduce the number of elements in each row.
4) Move to next line after each row.

Example Output:

12345
1234
123
12
1
*/

public class ReverseRightHalfPyramid{
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

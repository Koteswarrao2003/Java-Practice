/*
SUM OF NUMBERS USING STREAM API

This program calculates the sum
of elements in a list using Stream API.

Program Logic:
1) Create a list of integers.
2) Convert the list into a stream.
3) Use mapToInt() to convert Integer to int.
4) Use sum() method to add all elements.
5) Print the total sum.

Stream API provides a simple and
efficient way to perform operations on collections.
*/

import java.util.*;

public class SumOfNumbersWithStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum = " + sum);
    }
}

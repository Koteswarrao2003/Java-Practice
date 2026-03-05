/*
PRINT EVEN NUMBERS USING STREAM API

This program prints even numbers from a list
using Java Stream API.

Program Logic:
1) Create a list of integers.
2) Convert the list into a stream.
3) Use filter() to select even numbers (n % 2 == 0).
4) Use forEach() to print the filtered numbers.

This program demonstrates functional
programming using Java Streams.
*/

import java.util.*;

public class EvenNumbersWithStream {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);
    }
}

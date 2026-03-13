/*
FIND MAXIMUM NUMBER USING STREAM API

This program finds the maximum number
from a list using Java Stream API.

Program Logic:
1) Create a list of integers.
2) Convert the list into a stream.
3) Use max() method with compareTo()
   to find the largest number.
4) Store the result in Optional.
5) Print the maximum number using ifPresent().

Stream API helps to perform operations
on collections in a simple and functional way.
*/

import java.util.*;

public class MaximumNumberWithStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 45, 7, 89, 34);

        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);

        max.ifPresent(System.out::println);
    }
}

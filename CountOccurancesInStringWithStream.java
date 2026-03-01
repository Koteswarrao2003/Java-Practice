/*
COUNT CHARACTER OCCURRENCES USING STREAM API

This program counts how many times
each character appears in a string
using Java 8 Stream API.

Program Logic:
1) Take a string as input from user.
2) Split the string into individual characters.
3) Convert it into a Stream using Arrays.stream().
4) Use Collectors.groupingBy() to group same characters.
5) Use Collectors.counting() to count occurrences.
6) Store result in a Map and print it.

This approach is modern and shorter
compared to using loops.
*/

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurancesInStringWithStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input =sc.next();

        Map<String, Long> count = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(count);
    }
}

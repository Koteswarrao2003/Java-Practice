/*
CONVERT STRINGS TO UPPERCASE USING STREAM API

This program converts a list of strings
into uppercase using Java Stream API.

Program Logic:
1) Create a list of strings.
2) Convert the list into a stream.
3) Use map() to apply toUpperCase() on each element.
4) Collect the results into a new list.
5) Print the updated list.

Stream API provides a clean and modern
way to process collections.
*/

import java.util.*;
import java.util.stream.*;

public class StringUpperCaseWithStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("koti", "java", "developer");

        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upper);
    }
}

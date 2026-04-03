/*
WORKING WITH LIST METHODS

This program demonstrates basic methods
of List (ArrayList) in Java.

Program Logic:
1) Create a List and add elements.
2) Print the list.

Operations performed:

3) get(index) → Fetch element at specific position.
4) remove(value) → Remove an element from the list.
5) Iteration → Use for-each loop to display elements.

This program shows simple operations
on List collections.
*/

import java.util.*;
public class WorkingWithListMethods {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits List: " + fruits);

        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        System.out.println("Iterating through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

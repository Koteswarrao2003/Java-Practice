/*
MULTIPLE WAYS TO FETCH DATA FROM COLLECTION

This program demonstrates different ways
to retrieve elements from a List collection.

Methods used:

1) Ordinary for loop → Access elements using index.
2) For-each loop → Simple way to traverse collection.
3) Iterator → Used to iterate elements sequentially.
4) ListIterator → Allows forward and backward traversal.
5) Spliterator → Used for traversing and partitioning elements.
6) Stream API → Modern way to process collections.
7) Lambda Expression → Functional style iteration.
8) Method Reference → Short form of lambda expression.
9) Enumeration → Older way to traverse collection elements.

This program helps to understand multiple
approaches to access collection data in Java.
*/

import java.util.*;
public class MultipleWaysToFetchCollectionData {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(10, 20, 30, 40, 50);

        // 1. Using ordinary for loop
        System.out.println("Using ordinary for loop:");
        for(int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }

        // 2. Using for-each loop
        System.out.println("Using for-each loop:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // 3. Using Iterator
        System.out.println("Using Iterator:");
        Iterator<Integer> iterator=numbers.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // 4. Using ListIterator
        System.out.println("Using ListIterator In Normal way:");
        ListIterator<Integer> listIterator=numbers.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        // 5. Using ListIterator in reverse order
        System.out.println("Using ListIterator In Reverse way:");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        // 6. Using SplitIterator
        System.out.println("Using Spliterator:");
        Spliterator<Integer> spliterator=numbers.spliterator();
        spliterator.forEachRemaining(System.out::println);

        // 7. Using Stream API
        System.out.println("Using Stream API:");   
        numbers.stream().forEach(System.out::println);

        // 8. Using lambda expression
        System.out.println("Using Lambda Expression:"); 
        numbers.forEach(number -> System.out.println(number));

        // 9. Using method reference
        System.out.println("Using Method Reference:");
        numbers.forEach(System.out::println);

        // 10. Using Enumeration
        System.out.println("Using Enumeration:");
        Enumeration<Integer> enumeration= Collections.enumeration(numbers);
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

    }
}

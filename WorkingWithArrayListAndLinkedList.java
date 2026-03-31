/*
WORKING WITH ARRAYLIST AND LINKEDLIST

This program demonstrates operations
on ArrayList and LinkedList.

Program Logic:
1) Create an ArrayList and add elements.
2) Create a LinkedList and add elements.
3) Print both lists.

Operations performed:

4) Merge / Union:
   - Combine both lists using addAll().

5) Intersection:
   - Find common elements using retainAll().

6) Difference:
   - Elements in ArrayList not in LinkedList → removeAll()
   - Elements in LinkedList not in ArrayList → removeAll()

7) Union:
   - Combine all elements from both lists.

This program shows how to perform
different operations on collections.
*/

import java.util.*;
public class WorkingWithArrayListAndLinkedList {
   public static void main(String[] args) {
        List<String> arrayList=new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        System.out.println("Elements in ArrayList:");
        arrayList.forEach(System.out::println);

        System.out.println();

        List<String> linkedList=new LinkedList<>();
        linkedList.add("Elderberry");
        linkedList.add("Fig");
        linkedList.add("Grape");
        linkedList.add("Honeydew");

        System.out.println("\nElements in LinkedList:");
        linkedList.forEach(System.out::println);

        System.out.println();

        // Merging ArrayList and LinkedList
        List<String> mergedList=new ArrayList<>(arrayList);
        mergedList.addAll(linkedList);
        System.out.println("Merged List (ArrayList + LinkedList):");
        mergedList.forEach(System.out::println);

        System.out.println();

        // Intersection of ArrayList and LinkedList
        List<String> intersectionList=new  ArrayList<>(arrayList);
        intersectionList.retainAll(linkedList);
        System.out.println("Intersection of ArrayList and LinkedList:");
        intersectionList.forEach(x-> System.out.println(x));

        System.out.println();

        // Difference of ArrayList and LinkedList (ArrayList - LinkedList)
        List<String> differenceListArrayToLinked=new ArrayList<>(arrayList);
        differenceListArrayToLinked.removeAll(linkedList);
        System.out.println("Difference of ArrayList and LinkedList (ArrayList - LinkedList):");   
        differenceListArrayToLinked.forEach(x-> System.out.println(x));

        System.out.println();

        // Difference of LinkedList and ArrayList (LinkedList - ArrayList)
        List<String> differenceListLinkedToArray=new ArrayList<>(linkedList);
        differenceListLinkedToArray.removeAll(arrayList);
        System.out.println("Difference of LinkedList and ArrayList (LinkedList - ArrayList):");
        differenceListLinkedToArray.forEach(x-> System.out.println(x));

        System.out.println();

        // Union of ArrayList and LinkedList
        List<String> unionList=new ArrayList<>(arrayList);
        unionList.addAll(linkedList);
        System.out.println("Union of ArrayList and LinkedList:");
        unionList.forEach(x-> System.out.println(x));

    }
}

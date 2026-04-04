/*
WORKING WITH TREESET

This program demonstrates operations
on TreeSet in Java.

Program Logic:
1) Create a TreeSet for strings.
2) Add elements → automatically sorted.
3) Create another TreeSet for integers.

Operations performed:

4) Union:
   - Combine both sets using addAll().

5) Intersection:
   - Find common elements using retainAll().

6) Difference:
   - Remove elements using removeAll().

7) Equality Check:
   - Compare sets using equals().

Note:
- TreeSet stores elements in sorted order.
- It does not allow duplicate elements.
- It does not allow null values.
*/

import java.util.*;
public class WorkingWithTreeSet{
    public static void main(String[] args) {
        TreeSet<String> tset=new TreeSet<>();
        tset.add("Red");
        tset.add("Green");
        tset.add("Yellow");
        tset.add("Blue");

        System.out.println("TreeSet elements are:");
        tset.forEach(System.out::println);

        System.out.println();

        TreeSet<Integer> tsetInt=new TreeSet<>();
        tsetInt.add(10);
        tsetInt.add(4);
        tsetInt.forEach(x-> System.out.println(x));

        System.out.println();

        TreeSet<String> union=new TreeSet<>(tset);
        union.addAll(tsetInt.stream().map(String::valueOf).toList());
        System.out.println("Union of String TreeSet and Integer TreeSet:");
        union.forEach(System.out::println);

        System.out.println();

        TreeSet<String> intersection=new TreeSet<>(tset);
        intersection.retainAll(tsetInt.stream().map(String::valueOf).toList());
        System.out.println("Intersection of String TreeSet and Integer TreeSet:");
        intersection.forEach(x-> System.out.println(x));

        System.out.println();

        TreeSet<String> difference=new TreeSet<>(tset);
        difference.removeAll(tsetInt.stream().map(String::valueOf).toList());
        System.out.println("Difference of String TreeSet and Integer TreeSet (String TreeSet - Integer TreeSet):");
        difference.forEach(x-> System.out.println(x));

        System.out.println();

        boolean isEqual=tset.equals(tsetInt.stream().map(String::valueOf).toList());
        System.out.println("Are the String TreeSet and Integer TreeSet equal? " + isEqual);
    }
}

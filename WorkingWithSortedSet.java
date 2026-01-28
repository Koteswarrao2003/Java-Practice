import java.util.*;

public class WorkingWithSortedSet{
    public static void main(String[] args) {
        SortedSet<String> sortedSet=new TreeSet<>();
        sortedSet.add("Orange");
        sortedSet.add("Apple");
        sortedSet.add("Banana");    

        System.out.println("SortedSet elements are:");
        sortedSet.forEach(System.out::println);

        System.out.println();

        SortedSet<Integer> sortedSetInt=new TreeSet<>();
        sortedSetInt.add(25);
        sortedSetInt.add(5);
        sortedSetInt.forEach(x-> System.out.println(x));
        System.out.println();

        SortedSet<String> union=new TreeSet<>(sortedSet);
        union.addAll(sortedSetInt.stream().map(String::valueOf).toList());
        System.out.println("Union of String SortedSet and Integer SortedSet:");
        union.forEach(System.out::println);

        System.out.println();

        SortedSet<String> intersection=new TreeSet<>(sortedSet);
        intersection.retainAll(sortedSetInt.stream().map(String::valueOf).toList());
        System.out.println("Intersection of String SortedSet and Integer SortedSet:");
        intersection.forEach(x-> System.out.println(x));
        System.out.println();

        SortedSet<String> difference=new TreeSet<>(sortedSet);
        difference.removeAll(sortedSetInt.stream().map(String::valueOf).toList());
        System.out.println("Difference of String SortedSet and Integer SortedSet (String SortedSet - Integer SortedSet):");
        difference.forEach(x-> System.out.println(x));

        System.out.println();

        boolean isEqual=sortedSet.equals(sortedSetInt.stream().map(String::valueOf).toList());
        System.out.println("Are the String SortedSet and Integer SortedSet equal? " + isEqual);

        System.out.println();

        //SortedSet methods
        System.out.println("First Element: " + sortedSet.first());
        System.out.println("Last Element: " + sortedSet.last());
        System.out.println("Head Set (elements less than 'Banana'): " + sortedSet.headSet("Banana"));
        System.out.println("Tail Set (elements greater than or equal to 'Banana'): " + sortedSet.tailSet("Banana"));
        System.out.println("Sub Set (elements between 'Apple' and 'Orange'): " + sortedSet.subSet("Apple", "Orange"));

    }
}
import java.util.*;
public class WorkingWithHashSetAndLinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Blue");
        hashSet.add("Green");
        hashSet.add("Yellow");
        hashSet.add("Purple");

        System.out.println("Elements in HashSet:");
        hashSet.forEach(System.out::println);

        System.out.println();

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Cyan");
        linkedHashSet.add("Magenta");
        linkedHashSet.add("Yellow");
        linkedHashSet.add("Black");
        linkedHashSet.add("White");

        System.out.println("Elements in LinkedHashSet:");
        linkedHashSet.forEach(x -> System.out.println(x));

        System.out.println();

        // Merging HashSet and LinkedHashSet
        Set<String> mergedSet = new HashSet<>(hashSet);
        mergedSet.addAll(linkedHashSet);
        System.out.println("Merged Set (HashSet + LinkedHashSet):");
        mergedSet.forEach(System.out::println);

        System.out.println();

        // Intersection of HashSet and LinkedHashSet
        Set<String> intersectionSet = new HashSet<>(hashSet);
        intersectionSet.retainAll(linkedHashSet);
        System.out.println("Intersection of HashSet and LinkedHashSet:");
        intersectionSet.forEach(x -> System.out.println(x));

        System.out.println();

        // Difference of HashSet and LinkedHashSet (HashSet - LinkedHashSet)
        Set<String> differenceSetHashToLinked = new HashSet<>(hashSet);
        differenceSetHashToLinked.removeAll(linkedHashSet);
        System.out.println("Difference of HashSet and LinkedHashSet (HashSet - LinkedHashSet):");
        differenceSetHashToLinked.forEach(x -> System.out.println(x));

        System.out.println();

        // Difference of LinkedHashSet and HashSet (LinkedHashSet - HashSet)
        Set<String> differenceSetLinkedToHash = new HashSet<>(linkedHashSet);
        differenceSetLinkedToHash.removeAll(hashSet);
        System.out.println("Difference of LinkedHashSet and HashSet (LinkedHashSet - HashSet):");
        differenceSetLinkedToHash.forEach(x -> System.out.println(x));

        System.out.println();

        // Equality Check
        boolean isEqual = hashSet.equals(linkedHashSet);
        System.out.println("Are HashSet and LinkedHashSet equal? " + isEqual);

        System.out.println();
        
        // Size of HashSet
        System.out.println("Size of HashSet: " + hashSet.size());
        System.out.println();
        // Size of LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());
    }
}
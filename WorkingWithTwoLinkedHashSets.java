import java.util.*;
public class WorkingWithTwoLinkedHashSets{
    public static void main(String[] args) {
        Set<String> setA = new LinkedHashSet<>();
        setA.add("Apple");
        setA.add("Banana");
        setA.add("Cherry");
        setA.add("Date");

        Set<String> setB = new LinkedHashSet<>();
        setB.add("Cherry");
        setB.add("Date");
        setB.add("Elderberry");
        setB.add("Fig");

        // Printing Set A
        System.out.println("Elements in Set A:");
        setA.forEach(System.out::println);

        System.out.println();

        // Printing Set B
        System.out.println("Elements in Set B:");
        setB.forEach(System.out::println);

        System.out.println();

        // Union of Set A and Set B
        Set<String> unionSet=new LinkedHashSet<>(setA);
        unionSet.addAll(setB);

        System.out.println("Union of Set A and Set B:");
        unionSet.forEach(System.out::println);

        System.out.println();

        // Intersection of Set A and Set B
        Set<String> intersectionSet=new LinkedHashSet<>(setA);
        intersectionSet.retainAll(setB);
        System.out.println("Intersection of Set A and Set B:");
        intersectionSet.forEach(System.out::println);

        System.out.println();

        // Difference of Set A and Set B (A - B)
        Set<String> differenceSet=new LinkedHashSet<>(setA);
        differenceSet.removeAll(setB);
        System.out.println("Difference of Set A and Set B (A - B):");   
        differenceSet.forEach(System.out::println);

        System.out.println();

        //Difference of Set B and Set A (B - A)
        Set<String> differenceSetBA=new LinkedHashSet<>(setB);
        differenceSetBA.removeAll(setA);
        System.out.println("Difference of Set B and Set A (B - A):");
        differenceSetBA.forEach(System.out::println);

        System.out.println();

        // Equality Check
        boolean isEqual = setA.equals(setB);
        System.out.println("Are Set A and Set B equal? " + isEqual);

        System.out.println();

        // Size of Sets
        System.out.println("Size of Set A: " + setA.size());
        System.out.println("Size of Set B: " + setB.size());

    }
}
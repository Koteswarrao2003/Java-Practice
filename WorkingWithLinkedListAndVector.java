import java.util.*;
public class WorkingWithLinkedListAndVector {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");
        System.out.println("Elements in LinkedList:");
        linkedList.forEach(System.out::println);

        System.out.println();

        Vector<String> vector = new Vector<>();
        vector.add("Elderberry");
        vector.add("Cherry");
        vector.add("Grape"); 
        vector.add("Honeydew");
        System.out.println("Elements in Vector:");  
        vector.forEach(x-> System.out.println(x)); 

        System.out.println();

        // Merging LinkedList and Vector
        List<String> mergedList = new ArrayList<>(linkedList);  
        mergedList.addAll(vector);
        System.out.println("Merged List (LinkedList + Vector):");
        mergedList.forEach(System.out::println);

        System.out.println();

        // Intersection of LinkedList and Vector
        List<String> intersectionList = new ArrayList<>(linkedList);
        intersectionList.retainAll(vector);
        System.out.println("Intersection of LinkedList and Vector:");
        intersectionList.forEach(x -> System.out.println(x));

        System.out.println();

        // Difference of LinkedList and Vector (LinkedList - Vector)
        List<String> differenceListLinkedToVector = new ArrayList<>(linkedList);
        differenceListLinkedToVector.removeAll(vector);
        System.out.println("Difference of LinkedList and Vector (LinkedList - Vector):");
        differenceListLinkedToVector.forEach(x -> System.out.println(x));

        System.out.println();

        // Difference of Vector and LinkedList (Vector - LinkedList)
        List<String> differenceListVectorToLinked = new ArrayList<>(vector);
        differenceListVectorToLinked.removeAll(linkedList);
        System.out.println("Difference of Vector and LinkedList (Vector - LinkedList):");
        differenceListVectorToLinked.forEach(x -> System.out.println(x));

        System.out.println();

        // Equality Check
        boolean isEqual = linkedList.equals(vector);
        System.out.println("Are LinkedList and Vector equal? " + isEqual);

        System.out.println();

        // Size of LinkedList
        System.out.println("Size of LinkedList: " + linkedList.size());

        System.out.println();

        // Size of Vector
        System.out.println("Size of Vector: " + vector.size());
    }
}
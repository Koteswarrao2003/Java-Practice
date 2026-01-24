import java.util.*;
public class WorkWithArrayListAndVector{
    public static void main(String[] args) {
        List<String> arrayList=new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        System.out.println("Elements in ArrayList:");
        arrayList.forEach(System.out::println);

        System.out.println();

        List<String> vector=new Vector<>();
        vector.add("Elderberry");
        vector.add("Fig");
        vector.add("Grape");
        vector.add("Honeydew");

        System.out.println("\nElements in Vector:");
        vector.forEach(System.out::println);

        System.out.println();

        // Merging ArrayList and Vector
        List<String> mergedList=new ArrayList<>(arrayList);
        mergedList.addAll(vector);
        System.out.println("Merged List (ArrayList + Vector):");
        mergedList.forEach(System.out::println);

        System.out.println();

        // Intersection of ArrayList and Vector
        List<String> intersectionList=new  ArrayList<>(arrayList);
        intersectionList.retainAll(vector);
        System.out.println("Intersection of ArrayList and Vector:");
        intersectionList.forEach(x-> System.out.println(x));

        System.out.println();

        // Difference of ArrayList and Vector (ArrayList - Vector)
        List<String> differenceListArrayToVector=new ArrayList<>(arrayList);
        differenceListArrayToVector.removeAll(vector);
        System.out.println("Difference of ArrayList and Vector (ArrayList - Vector):");   
        differenceListArrayToVector.forEach(x-> System.out.println(x));

        System.out.println();

        // Difference of Vector and ArrayList (Vector - ArrayList)
        List<String> differenceListVectorToArray=new ArrayList<>(vector);
        differenceListVectorToArray.removeAll(arrayList);
        System.out.println("Difference of Vector and ArrayList (Vector - ArrayList):");
        differenceListVectorToArray.forEach(x-> System.out.println(x));

        System.out.println();

        // Equality Check
        boolean isEqual = arrayList.equals(vector);
        System.out.println("Are ArrayList and Vector equal? " + isEqual);
    }
}
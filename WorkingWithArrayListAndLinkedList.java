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
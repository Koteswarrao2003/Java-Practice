import java.util.*;

public class WorkingWithTwoArrayLists{
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();
        listA.add("Dog");
        listA.add("Cat");
        listA.add("Rabbit");
        listA.add("Parrot");
        
        List<String> listB = new ArrayList<>();
        listB.add("Rabbit");
        listB.add("Parrot");
        listB.add("Aquarium");
        listB.add("Fish");

        // Printing List A
        System.out.println("Elements in List A:");
        listA.forEach(System.out::println);

        System.out.println();

        // Printing List B
        System.out.println("Elements in List B:");
        listB.forEach(System.out::println);

        System.out.println();

        // Union of List A and List B
        List<String> unionList=new ArrayList<>(listA);
        unionList.addAll(listB);
        System.out.println("Union of List A and List B:");
        unionList.forEach(x-> System.out.println(x));

        System.out.println();

        //Intersection of List A and List B
        List<String> intersectionList=new ArrayList<>(listA);
        intersectionList.retainAll(listB);
        System.out.println("Intersection of List A and List B:");
        intersectionList.forEach(x-> System.out.println(x));

        System.out.println();

        // Differencec of List A and List B (A-B)
        List<String> differenceListAtoB=new ArrayList<>(listA);
        differenceListAtoB.removeAll(listB);
        System.out.println("Difference of List A and List B (A - B):");   
        differenceListAtoB.forEach(x-> System.out.println(x));

        System.out.println();

        // Difference of List B and List A (B-A)
        List<String> differenceListBtoA=new ArrayList<>(listB);
        differenceListBtoA.removeAll(listA);
        System.out.println("Difference of List B and List A (B - A):");
        differenceListBtoA.forEach(x-> System.out.println(x));

        System.out.println();

        // Equality Check
        boolean isEqual = listA.equals(listB);
        System.out.println("Are List A and List B equal? " + isEqual);
        
        System.out.println();

        //Size of List A and List B
        System.out.println("Size of List A: " + listA.size());
        System.out.println("Size of List B: " + listB.size());

        System.out.println();
    }
}
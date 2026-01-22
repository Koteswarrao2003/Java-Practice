import java.util.*;
public class WorkingWithVector{
    public static void main(String[] args) {
        Vector<String> animals = new Vector<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Tiger");
        animals.add("Lion");

        // Printing the Vector
        System.out.println("Animals in the Vector:");
        animals.forEach(System.out::println);

        System.out.println();

        // Removing an element
        animals.remove("Tiger");
        System.out.println("Animals after removing Tiger:");
        animals.forEach(x->System.out.println(x));

        System.out.println();

        // Checking if vector is empty or not
        System.out.println("Is the vector empty?"+animals.isEmpty());

        System.out.println();

        // Size of the Vector
        System.out.println("Total number of animals: " + animals.size());

        System.out.println();

        // Printing using Iterator
        System.out.println("Using Iterator to print elements:");
        Iterator<String> iterator=animals.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        // Contains or not
        System.out.println("Contains Check:");
        String searchAnimal = "Cat";
        boolean result =animals.contains(searchAnimal) ? true:false;
        System.out.println( result ? searchAnimal +" is present in the vector." : searchAnimal + " is not present in the vector.");

        System.out.println();

        // Clear the Vector
        System.out.println("Clearing the vector");
        animals.clear();
        System.out.println("Is the vector empty after clearing? " + animals.isEmpty());

    }
}
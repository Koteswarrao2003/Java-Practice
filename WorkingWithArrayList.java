import java.util.*;
public class WorkingWithArrayList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Pineapple");
        fruits.add("Grapes");
        fruits.add("Strawberry");

        //Priting the ArrayList
        System.out.println("Fruits in the ArrayList:");

        // Internally consumer working 
        fruits.forEach(System.out::println);

        System.out.println();

        // Removing an element
        fruits.remove("Mango");
        System.out.println("Fruits after removing Mango:");
        fruits.forEach(System.out::println);

        System.out.println();

        // Checking if an element exists
        System.out.println("Contains Check:");
        String searchFruit = "Banana";
        if(fruits.contains(searchFruit)){
            System.out.println(searchFruit + " is present in the list.");
        } else {
            System.out.println(searchFruit + " is not present in the list.");
        }

        System.out.println();

        // Size of the ArrayList
        System.out.println("Total number of fruits: " + fruits.size());

        System.out.println();

        //After adding new element
        fruits.add(0, "Watermelon");
        System.out.println("Fruits after adding Watermelon at index 0:");
        fruits.forEach(System.out::println);

        System.out.println();

        // Fetching element at specific index
        int indexToFetch = 3;
        System.out.println("Fruit at index " + indexToFetch + ": " + fruits.get(indexToFetch));

        System.out.println();

        // Replacing an element
        fruits.set(2, "Kiwi");
        System.out.println("Fruits after replacing element at index 2 with Kiwi:"); 
        fruits.forEach(System.out::println);

        System.out.println();

        // Checking if the ArrayList is empty
        System.out.println("Is the fruits list empty? " + fruits.isEmpty());

        System.out.println();

        // Clearing the ArrayList
        System.out.println("Clearing the fruits list");
        fruits.clear();

        // Checking if the ArrayList is empty after clearing
        System.out.println("Is the fruits list empty after clearing? " + fruits.isEmpty());
    }   
}
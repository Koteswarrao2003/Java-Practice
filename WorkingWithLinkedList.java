import java.util.*;
public class WorkingWithLinkedList{
    public static void main(String[] args) {
        
        LinkedList<String> cities = new LinkedList<>();
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");
        cities.add("Phoenix");

        // Printing the LinkedList
        System.out.println("Cities in the LinkedList:");
        cities.forEach(System.out::println);

        System.out.println();

        // Add using offer
        cities.offer("Miami");
        System.out.println("Cities after adding Miami using offer:");
        cities.forEach(System.out::println);

        System.out.println();

        // Add using addFirst
        cities.offerFirst("Seattle");
        System.out.println("Cities after adding Seattle at the beginning using offerFirst:");
        cities.forEach(System.out::println);

        System.out.println();

        // Add using addLast
        cities.offerLast("Boston"); 
        System.out.println("Cities after adding Boston at the end using offerLast:");
        cities.forEach(System.out::println);

        System.out.println();

        // Removing a city
        cities.remove("Houston");
        System.out.println("Cities after removing Houston:");
        cities.forEach(System.out::println);

        System.out.println();

        //Removing first city
        cities.removeFirst();   
        System.out.println("Cities after removing the first city:");
        cities.forEach(System.out::println);

        System.out.println();

        //Removing last city
        cities.removeLast();
        System.out.println("Cities after removing the last city:");
        cities.forEach(System.out::println);

        System.out.println();

        // Checking if a city exists
        System.out.println("Contains Check:");
        String searchCity = "Chicago";
        System.out.println(cities.contains(searchCity) ? searchCity + " is present in the list." : searchCity + " is not present in the list.");

        System.out.println();

        // Size of the LinkedList
        System.out.println("Total number of cities: " + cities.size());

        System.out.println();

        // Clearing the LinkedList
        System.out.println("Clearing the cities list");
        cities.clear();

        // Checking if the LinkedList is empty after clearing
        System.out.println("Is the cities list empty after clearing? " + cities.isEmpty()); 

        // Adding elements again for demonstration
        cities.add("Miami");
        cities.add("Seattle");
        System.out.println("Cities after adding Miami and Seattle again:");
        cities.forEach(System.out::println);
    }
}   
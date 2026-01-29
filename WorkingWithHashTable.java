import java.util.*;
public class WorkingWithHashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);
        hashtable.put("Four", 4);

        System.out.println("Hashtable elements are:");
        hashtable.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println();

        // Accessing elements
        System.out.println("Value for key 'Two': " + hashtable.get("Two"));
        System.out.println("Contains key 'Three': " + hashtable.containsKey("Three"));
        System.out.println("Contains value 5: " + hashtable.containsValue(5));
        System.out.println("Size of the Hashtable: " + hashtable.size());
        System.out.println();

        // Removing an element
        hashtable.remove("One");
        System.out.println("Hashtable elements after removing key 'One':");
        hashtable.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println();

        // Iterating over keys and values
        System.out.println("Iterating over keys:");
        for (String key : hashtable.keySet()) {
            System.out.println(key);
        }
        System.out.println();

        System.out.println("Iterating over values:");
        for (Integer value : hashtable.values()) {
            System.out.println(value);
        }
        System.out.println();

        // Clearing the Hashtable
        hashtable.clear();
        System.out.println("Hashtable size after clearing: " + hashtable.size());
    }
}
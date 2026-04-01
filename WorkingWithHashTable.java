

/*
WORKING WITH HASHTABLE

This program demonstrates basic operations
on Hashtable in Java.

Program Logic:
1) Create a Hashtable and add key-value pairs.
2) Print elements using forEach().

Operations performed:

3) Access elements → get(key)
4) Check key/value → containsKey(), containsValue()
5) Get size → size()
6) Remove element → remove(key)

7) Iteration:
   - Iterate keys using keySet()
   - Iterate values using values()

8) Clear all elements → clear()

Note:
- Hashtable stores data as key-value pairs.
- It does not allow null key or null value.
- It is synchronized (thread-safe).
*/import java.util.*;
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

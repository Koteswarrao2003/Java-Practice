/*
WORKING WITH HASHMAP

This program demonstrates basic operations
on HashMap in Java.

Program Logic:
1) Create a HashMap and add key-value pairs.
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
- HashMap stores data as key-value pairs.
- It allows one null key and multiple null values.
- It does not maintain insertion order.
*/

import java.util.*;

public class WorkingWithMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Map elements are:");
        map.forEach((key, value)-> System.out.println(key+" : "+value));

        System.out.println();

        // Accessing elements
        System.out.println("Value for key 'Two': " + map.get("Two"));
        System.out.println("Contains key 'Three': " + map.containsKey("Three"));
        System.out.println("Contains value 4: " + map.containsValue(4));
        System.out.println("Size of the map: " + map.size());

        System.out.println();

        // Removing an element
        map.remove("One");
        System.out.println("Map elements after removing key 'One':");
        map.forEach((key, value)-> System.out.println(key+" : "+value));

        System.out.println();

        // Iterating over keys and values
        System.out.println("Iterating over keys:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println();
        System.out.println("Iterating over values:");
        for (Integer value : map.values()) {
            System.out.println(value);
        }

        System.out.println();

        // Clearing the map
        map.clear();
        System.out.println("Map size after clearing: " + map.size()); 
         
    }
}

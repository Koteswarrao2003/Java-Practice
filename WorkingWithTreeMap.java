/*
WORKING WITH TREEMAP

This program demonstrates basic operations
on TreeMap in Java.

Program Logic:
1) Create a TreeMap and add key-value pairs.
2) Print elements (automatically sorted by keys).

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
- TreeMap stores data in sorted order (based on keys).
- It does not allow null keys.
- It is not synchronized.
*/

import java.util.*;
public class WorkingWithTreeMap{
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);
        treeMap.put("Four", 4);

        System.out.println("TreeMap elements are (sorted by keys):");
        treeMap.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println();

        // Accessing elements
        System.out.println("Value for key 'Two': " + treeMap.get("Two"));
        System.out.println("Contains key 'Three': " + treeMap.containsKey("Three"));
        System.out.println("Contains value 5: " + treeMap.containsValue(5));
        System.out.println("Size of the TreeMap: " + treeMap.size());
        System.out.println();

        // Removing an element
        treeMap.remove("One");
        System.out.println("TreeMap elements after removing key 'One':");
        treeMap.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println();

        // Iterating over keys and values
        System.out.println("Iterating over keys:");
        for (String key : treeMap.keySet()) {
            System.out.println(key);
        }
        System.out.println();

        System.out.println("Iterating over values:");
        for (Integer value : treeMap.values()) {
            System.out.println(value);
        }
        System.out.println();

        // Clearing the TreeMap
        treeMap.clear();
        System.out.println("TreeMap size after clearing: " + treeMap.size());

    }
}

import java.util.*;

public class WorkingWithLinkedHashMap{
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A", "Apple");
        linkedHashMap.put("B", "Banana");
        linkedHashMap.put("C", "Cherry");
        linkedHashMap.put("D", "Date");

        System.out.println("LinkedHashMap elements are:");  
        linkedHashMap.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println();

        // Accessing elements
        System.out.println("Value for key 'B': " + linkedHashMap.get("B"));
        System.out.println("Contains key 'C': " + linkedHashMap.containsKey("C"));
        System.out.println("Contains value 'Date': " + linkedHashMap.containsValue("Date"));
        System.out.println("Size of the LinkedHashMap: " + linkedHashMap.size());

        System.out.println();

        // Removing an element
        linkedHashMap.remove("A");
        System.out.println("LinkedHashMap elements after removing key 'A':");  
        linkedHashMap.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println();

        // Iterating over keys and values
        System.out.println("Iterating over keys:"); 
        for (String key : linkedHashMap.keySet()) {
            System.out.println(key);
        }
        System.out.println();

        System.out.println("Iterating over values:");
        for (String value : linkedHashMap.values()) {
            System.out.println(value);
        }
        System.out.println();

        // Clearing the LinkedHashMap
        linkedHashMap.clear();
        System.out.println("LinkedHashMap size after clearing: " + linkedHashMap.size());

    }
}
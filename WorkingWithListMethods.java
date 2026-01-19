import java.util.*;
public class WorkingWithListMethods {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits List: " + fruits);

        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        System.out.println("Iterating through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
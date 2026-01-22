import java.util.*;
public class WorkingWithHashSet {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Printing the HashSet
        System.out.println("Colors in the HashSet:");
        colors.forEach(System.out::println);

        System.out.println();

        // Checking if a color exists
        String searchColor = "Green";
        System.out.println("Contains Check:");
        boolean flag = colors.contains(searchColor) ? true : false;
        System.out.println(flag ? searchColor + " is present in the HashSet" : searchColor + " is not present in the HashSet.");

        System.out.println();

        // Size of the HashSet
        System.out.println("Total number of elements in HashSet: " + colors.size());

        System.out.println();

        // Removing a color
        colors.remove("Yellow");
        System.out.println("Colors after removing Yellow:");
        colors.forEach(System.out::println);

        System.out.println();

        // Clearing the HashSet
        System.out.println("Clearing the HashSet");
        colors.clear();

        System.out.println();

        // Checking if HashSet is empty after clearing
        System.out.println("Is the HashSet empty after clearing? " + colors.isEmpty());
    }
}
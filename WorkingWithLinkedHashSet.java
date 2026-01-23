import java.util.*;

public class WorkingWithLinkedHashSet{
    public static void main(String[] args) {
        Set<String> movies= new LinkedHashSet<>();
        movies.add("Inception");
        movies.add("The Dark Knight");
        movies.add("Interstellar");
        movies.add("Avatar");
        movies.add("Titanic");
        movies.add("Inception"); // Duplicate entry
        movies.add("Avatar");    // Duplicate entry
        movies.add(null);      // Adding null value
        movies.add(null);      // Adding another null value
        movies.add("Avengers");

        // Printing LinkedHashSet
        System.out.println("Movies in the LinkedHashSet:");
        movies.forEach(System.out::println);

        System.out.println();

        // Checking if a movie exists
        String searchMovie = "Interstellar";
        System.out.println("Contains Check: ");
        boolean flag = movies.contains(searchMovie);
        System.out.println(flag ? searchMovie + " is present in the LinkedHashSet" : searchMovie + " is not present in the LinkedHashSet.");

        System.out.println();

        // Size of the LinkedHashSet
        System.out.println("Total number of elements in LinkedHashSet: " + movies.size());

        System.out.println();

        // Check LinkedHashSet Empty or Not
        System.out.println("Is the LinkedHashSet empty? " + movies.isEmpty());

        System.out.println();

        // Removing a movie
        movies.remove("Titanic");
        System.out.println("Movies after removing Titanic:");
        movies.forEach(System.out::println);

        System.out.println();

        // Clearing the LinkedHashSet
        System.out.println("Clearing the LinkedHashSet");
        movies.clear();
        
        System.out.println();

        // Checking if LinkedHashSet is empty after clearing
        System.out.println("Is the LinkedHashSet empty after clearing? " + movies.isEmpty());
        
    }
}
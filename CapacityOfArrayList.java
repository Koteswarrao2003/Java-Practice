import java.util.*;
public class CapacityOfArrayList{
    public static void main(String []args){
        List<String> books=new ArrayList<>(10);
        books.add("Java");
        books.add("Python");
        books.add("C++");
        books.add("React.js");

        System.out.println("Capacity of Arraylist: "+books.size());
    }
}
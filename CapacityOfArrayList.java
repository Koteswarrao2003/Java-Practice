/*
CAPACITY OF ARRAYLIST PROGRAM

This program demonstrates ArrayList in Java.

1) We create an ArrayList with initial capacity 10.
   (Capacity means how many elements it can hold internally.)

2) We add some book names into the list.

3) size() method returns the number of elements
   currently present in the ArrayList.

Note:
Capacity and size are different.
Capacity → internal storage limit.
Size → number of elements actually added.
*/

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

/*
CREATING A LIST USING ARRAYLIST

This program demonstrates how to create
and use a List in Java.

Program Logic:
1) Create a List using ArrayList.
2) Add elements using add() method.
3) Print the list.

List is part of Collection Framework.
ArrayList is dynamic, meaning its size
can grow automatically when elements are added.
*/

import java.util.*;
public class CreatingList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("List: " + list);
    }
}

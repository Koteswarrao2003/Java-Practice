/*
WORKING WITH VECTOR AND STACK

This program demonstrates operations
on Vector and Stack collections.

Program Logic:
1) Create a Vector and add elements.
2) Create a Stack and add elements.
3) Print both collections.

Operations performed:

4) Merge:
   - Combine both using addAll().

5) Intersection:
   - Find common elements using retainAll().

6) Difference:
   - Elements in Vector not in Stack → removeAll()
   - Elements in Stack not in Vector → removeAll()

7) Equality Check:
   - Compare both using equals().

8) Size:
   - Get number of elements using size().

Note:
- Vector is synchronized and allows duplicates.
- Stack follows LIFO (Last In First Out).
*/

import java.util.*;
public class WorkingWithVectorAndStack{
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        vector.add("Lion");
        vector.add("Tiger");
        vector.add("Bear");
        vector.add("Wolf");
        vector.add("Fox");

        System.out.println("Elements in Vector:");
        vector.forEach(System.out::println);

        System.out.println();

        Stack<String> stack=new Stack<>();
        stack.add("Eagle");
        stack.add("Hawk");
        stack.add("Falcon");
        stack.add("Owl");
        stack.add("Raven");

        System.out.println("Elements in Stack:");
        stack.forEach(x-> System.out.println(x));

        System.out.println();

        // Merging Vector and Stack
        List<String> mergedList=new ArrayList<>(vector);
        mergedList.addAll(stack);
        System.out.println("Merged List (Vector + Stack):");
        mergedList.forEach(System.out::println);

        System.out.println();

        // Intersection of Vector and Stack
        List<String> intersectionList=new ArrayList<>(vector);
        intersectionList.retainAll(stack);
        System.out.println("Intersection of Vector and Stack:");
        intersectionList.forEach(x-> System.out.println(x));    

        System.out.println();

        //Difference of Vector and Stack (Vector - Stack)
        List<String> differenceListVectorToStack=new ArrayList<>(vector);
        differenceListVectorToStack.removeAll(stack);
        System.out.println("Difference of Vector and Stack (Vector - Stack):");
        differenceListVectorToStack.forEach(x-> System.out.println(x));

        System.out.println();

        //Difference of Stack and Vector (Stack - Vector)
        List<String> differenceListStackToVector=new ArrayList<>(stack);
        differenceListStackToVector.removeAll(vector);
        System.out.println("Difference of Stack and Vector (Stack - Vector):");
        differenceListStackToVector.forEach(x-> System.out.println(x));

        System.out.println();

        // Equality Check
        boolean isEqual=vector.equals(stack);
        System.out.println("Are Vector and Stack equal? " + isEqual);

        System.out.println();

        // Size of Vector
        System.out.println("Size of Vector: " + vector.size());
        System.out.println();
        // Size of Stack
        System.out.println("Size of Stack: " + stack.size());
        
    }
}

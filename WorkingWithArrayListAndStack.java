import java.util.*;
public class WorkingWithArrayListAndStack {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        System.out.println("Elements in ArrayList:");
        arrayList.forEach(System.out::println);

        System.out.println();

        Stack<String> stack = new Stack<>();
        stack.push("Elderberry");
        stack.push("Fig");
        stack.push("Grape");    

        System.out.println("\nElements in Stack:");
        stack.forEach(System.out::println);
        System.out.println();

        // Merging ArrayList and Stack
        List<String> mergedList = new ArrayList<>(arrayList);
        mergedList.addAll(stack);
        System.out.println("Merged List (ArrayList + Stack):");
        mergedList.forEach(System.out::println);

        System.out.println();

        // Intersection of ArrayList and Stack
        List<String> intersectionList = new ArrayList<>(arrayList); 
        intersectionList.retainAll(stack);
        System.out.println("Intersection of ArrayList and Stack:");
        intersectionList.forEach(x -> System.out.println(x));

        System.out.println();

        // Difference of ArrayList and Stack (ArrayList - Stack)
        List<String> differenceListArrayToStack = new ArrayList<>(arrayList);
        differenceListArrayToStack.removeAll(stack);
        System.out.println("Difference of ArrayList and Stack (ArrayList - Stack):");
        differenceListArrayToStack.forEach(x -> System.out.println(x));
        
        System.out.println();

        // Difference of Stack and ArrayList (Stack - ArrayList)
        List<String> differenceListStackToArray = new ArrayList<>(stack);
        differenceListStackToArray.removeAll(arrayList);
        System.out.println("Difference of Stack and ArrayList (Stack - ArrayList):");
        differenceListStackToArray.forEach(x -> System.out.println(x));

        System.out.println();

        // Equality Check
        boolean isEqual = arrayList.equals(stack);
        System.out.println("Are ArrayList and Stack equal? " + isEqual);

        System.out.println();

        // Working with stack operations
        System.out.println("Top element of Stack: " + stack.peek());    
        System.out.println("Popping elements from Stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("Is Stack empty after popping all elements? " + stack.isEmpty());

        

    }
}
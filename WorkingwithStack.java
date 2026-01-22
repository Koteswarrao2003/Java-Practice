import java.util.*;
public class WorkingwithStack{
    public static void main(String []args){
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        // Printing the Stack
        System.out.println("Stack elements:");
        stack.forEach(System.out::println);
        System.out.println();

        // Popping an element
        System.out.println("Popped element: " + stack.pop());

        System.out.println();

        // Printing the Stack after pop
        System.out.println("Stack after popping an element:");
        stack.forEach(System.out::println);

        System.out.println();

        // Peeking the top element
        System.out.println("Top element using peek: " + stack.peek());

        System.out.println();

        // Printing stack after peek
        System.out.println("Stack after peek (unchanged):");
        stack.forEach(System.out::println);

        System.out.println();

        // Checking if stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        System.out.println();

        // Size of the Stack
        System.out.println("Total number of elements in stack: " + stack.size());

        System.out.println();

        // Contains check
        String searchElement = "Second";
        System.out.println("Contains Check:");
        boolean flag=stack.contains(searchElement) ? true:false;
        System.out.println(flag ? searchElement + " is present in the stack" : searchElement + " is not present in the stack.");

        System.out.println();

        //Clearing the Stack
        System.out.println("Clearing the stack");
        stack.clear();

        System.out.println();

        // Checking if stack is empty after clearing
        System.out.println("Is the stack empty after clearing? " + stack.isEmpty());

    }
}
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
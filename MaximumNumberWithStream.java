import java.util.*;

public class MaximumNumberWithStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 45, 7, 89, 34);

        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);

        max.ifPresent(System.out::println);
    }
}
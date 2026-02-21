import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurancesInStringWithStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input =sc.next();

        Map<String, Long> count = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(count);
    }
}
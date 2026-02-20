import java.util.*;
import java.util.stream.*;

public class StringUpperCaseWithStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("koti", "java", "developer");

        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upper);
    }
}
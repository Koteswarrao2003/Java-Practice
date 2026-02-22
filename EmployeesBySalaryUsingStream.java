import java.util.*;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " - " + salary;
    }
}

public class EmployeesBySalaryUsingStream {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Koti", 50000),
                new Employee("Ravi", 30000),
                new Employee("Akash", 70000)
        );

        list.stream()
                .sorted(Comparator.comparingInt(e -> e.salary))
                .forEach(System.out::println);
    }
}
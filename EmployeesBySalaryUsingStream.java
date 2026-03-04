/*
SORT EMPLOYEES BY SALARY USING STREAM API

This program sorts employees based on salary
using Java Stream API.

Program Logic:
1) Create an Employee class with name and salary.
2) Create a list of Employee objects.
3) Convert the list into a stream.
4) Use sorted() with Comparator to sort employees by salary.
5) Print the sorted employees using forEach().

This program demonstrates:
- Custom class objects
- Stream API
- Comparator for sorting
*/

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

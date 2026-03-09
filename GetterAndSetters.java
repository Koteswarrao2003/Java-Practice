/*
GETTERS AND SETTERS IN JAVA

This program demonstrates how to use
getter and setter methods in Java.

Program Logic:
1) Variables (name, age, salary) are declared as private.
2) A constructor is used to initialize the values.
3) Setter methods are used to update the values.
4) Getter methods are used to retrieve the values.
5) toString() method prints the object details in a readable format.

This helps in data hiding and controlled
access to class variables.
*/

class SubGetterAndSetter{
    private String name;
    private int age;
    private double salary;

    public SubGetterAndSetter(String name, int age, double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }

    public String toString(){
        return "SubGetterAndSetter { Name:"+name+", Age:"+age+", Salary:"+salary+" }";
    }
}

public class GetterAndSetters{
    public static void main(String[] args) {
        SubGetterAndSetter gs=new SubGetterAndSetter("Ram", 21, 25000);
        System.out.println(gs.toString());

        gs.setName("Satish");
        System.out.println(gs.getName());

        gs.setSalary(32000);
        System.out.println(gs.toString());
    }
}

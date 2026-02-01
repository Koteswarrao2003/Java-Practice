class EncapsulationSub{
    private String name;
    private int age;
    private double salary;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age>0){
            this.age=age;
        }else{
            System.out.println("Please enter a valid age.");
        }
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        if(salary>=0){
            this.salary=salary;
        }else{
            System.out.println("Salary cannot be negative.");
        }
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        EncapsulationSub emp=new EncapsulationSub();
        emp.setName("Ram");
        emp.setAge(30);
        emp.setSalary(50000);

        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());
    }
}
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
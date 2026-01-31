class Parent {
    void show() {
        System.out.println("Parent class show method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class show method");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.show(); 

        Child child = new Child();
        child.show();  

        Parent polyParent = new Child();
        polyParent.show(); 
    }
}

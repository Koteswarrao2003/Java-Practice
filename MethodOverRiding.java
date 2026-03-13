/*
METHOD OVERRIDING IN JAVA

Method Overriding occurs when a child class
provides its own implementation of a method
that is already defined in the parent class.

Program Logic:
1) Parent class has a method show().
2) Child class overrides the show() method.
3) When the method is called, the child class
   version is executed.

In main():
- Parent object calls Parent method.
- Child object calls Child method.
- Parent reference with Child object demonstrates
  runtime polymorphism.

The @Override annotation indicates that
the method is overriding the parent method.
*/

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

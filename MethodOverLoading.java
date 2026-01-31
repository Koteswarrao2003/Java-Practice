public class MethodOverLoading {
    
    public void display(int x) {
        System.out.println("Method called with integer: " + x);
    }

    public void display(String str) {
        System.out.println("Method called with string: " + str);
    }

    public void display(int x, String str) {
        System.out.println("Method called with integer: " + x + " and string: " + str);
    }

    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();
        obj.display(10);
        obj.display("Hello");
        obj.display(20, "World");
    }
}
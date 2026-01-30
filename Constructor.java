public class Constructor {
    int a;
    String b;

    public Constructor(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public Constructor() {
        this.a = 0;
        this.b = "default";
    }

    public void display() {
        System.out.println("a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
        Constructor obj1 = new Constructor(10, "Hello");
        obj1.display();
        
        Constructor obj2 = new Constructor();
        obj2.display();
    }
}
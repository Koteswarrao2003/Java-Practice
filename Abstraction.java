abstract class AbstractionSub{
    public abstract void animalSound();
    public abstract void sleep();

}

class Dog extends AbstractionSub{

    @Override
    public void animalSound(){
        System.out.println("Woof");
    }

    @Override
    public void sleep(){
        System.out.println("Zzz");
    }
}

public class Abstraction{
    public static void main(String[] args) {
        Dog myDog=new Dog();
        myDog.animalSound();
        myDog.sleep();
    }
}
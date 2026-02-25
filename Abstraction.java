/*
ABSTRACTION

Abstraction means hiding details and showing only important features.

AbstractionSub is an abstract class.
It has methods without body (animalSound and sleep).

Dog class gives the actual implementation.
animalSound() → Woof
sleep() → Zzz

We cannot create object of abstract class directly.
We must use a child class.

Example:
All animals make sound, but each animal has its own sound.
That is abstraction.
*/

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

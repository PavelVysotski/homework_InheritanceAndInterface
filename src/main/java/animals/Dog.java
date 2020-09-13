package animals;

public class Dog extends Mammal{

    public Dog(String name) {
        super(name);
    }

    public void bark(){
        System.out.println(name + " is barking");
    }

    @Override
    public void run() {
        System.out.println(name + " is running fast");
    }

    @Override
    protected void eat() {
        System.out.println(name + " is eating meat");
    }
}

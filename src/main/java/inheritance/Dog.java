package inheritance;

public class Dog extends Mammal{

    public Dog(String name) {
        super(name);
    }

    public void bark(){
        System.out.println(name + " is barking");
    }
}
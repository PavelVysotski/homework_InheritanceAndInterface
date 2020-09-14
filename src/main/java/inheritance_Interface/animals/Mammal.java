package inheritance_Interface.animals;

public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    protected void hasTeeth() {
        System.out.println(name + " have teeth");
    }

    protected void run (){
        System.out.println(name + " is running");
    }

    @Override
    protected void eat() {
        System.out.println(name + " is eating");
    }
}

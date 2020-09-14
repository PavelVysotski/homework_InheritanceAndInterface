package inheritance_Interface.animals;

public class Cat extends Mammal {

    public Cat(String name) {
        super(name);
    }

    public void meows (){
        System.out.println(name + " is meows");
    }

    @Override
    public void run() {
        System.out.println(name + " is running on four legs");    }

    @Override
    public void eat() {
        System.out.println(name + " is eating fish");
    }
}

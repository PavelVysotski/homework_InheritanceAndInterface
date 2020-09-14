package inheritance_Interface.animals;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(name + " is flying");
    }


    public void run() {
        System.out.println(name + " is running on two legs");
    }
}

package animals;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    protected void fly() {
        System.out.println(name + " is flying");
    }


    protected void run() {
        System.out.println(name + " is running on two legs");
    }
}

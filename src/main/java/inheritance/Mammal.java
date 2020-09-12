package inheritance;

public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    public void hasTeeth() {
        System.out.println(name + " have teeth");
    }

    public void run (){
        System.out.println(name + " is running");
    }
}

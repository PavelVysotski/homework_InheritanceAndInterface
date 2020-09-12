package inheritance;

public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    public void hasTeeth() {
        System.out.println(name + " have teeth");
    }

    @Override
    public void run (){
        System.out.println(name + " is running on four legs");
    }
}

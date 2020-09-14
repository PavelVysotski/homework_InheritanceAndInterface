package inheritance_Interface.animals;

public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    public void haveFeathers (){
        System.out.println(name + " have colored feathers");
    }

    @Override
    public void run() {
        System.out.println(name + " is running very slowly");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating corn");
    }
}

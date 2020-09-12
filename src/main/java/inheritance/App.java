package inheritance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Cat cat = new Cat("Fluffy");
        Dog dog = new Dog("Barbos");
        Parrot parrot= new Parrot("Gosha");

        cat.meows();
        cat.hasTeeth();
        cat.sleep();
        cat.eat();
        cat.run();
        System.out.println("______________");
        parrot.haveFeathers();
        parrot.fly();
        parrot.eat();
        parrot.run();
        parrot.sleep();
        System.out.println("______________");
        dog.bark();
        dog.eat();
        dog.hasTeeth();
        dog.run();
        dog.sleep();


    }
}

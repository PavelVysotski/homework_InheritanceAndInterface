package inheritance;

public class App {

    public static void main(String[] args) {
        Cat cat = new Cat("Fluffy");
        Dog dog = new Dog("Barbos");
        Parrot parrot = new Parrot("Gosha");

        Mammal mammalDog = new Mammal("Dog");
        Mammal mammalCat = new Mammal("Cat");
        Bird bird = new Bird("Bird");


        mammalDog.run();
        mammalCat.run();
        bird.run();
        System.out.println("______________");
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

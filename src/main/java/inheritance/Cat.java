package inheritance;

public class Cat extends Mammal{

    public Cat(String name) {
        super(name);
    }

    public void meows (){
        System.out.println(name + " is meows");
    }
}

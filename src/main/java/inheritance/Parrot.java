package inheritance;

public class Parrot extends Bird{
    public Parrot(String name) {
        super(name);
    }

    public void haveFeathers (){
        System.out.println(name + " have colored feathers");
    }
}
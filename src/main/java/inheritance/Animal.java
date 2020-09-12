package inheritance;


import java.util.Objects;

public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    protected void eat () {
        System.out.println(name + " is eating");
    }

    protected void sleep (){
        System.out.println(name + " is sleeping");

    }

    protected void run () {
        System.out.println(name + " is eating");

    }


}

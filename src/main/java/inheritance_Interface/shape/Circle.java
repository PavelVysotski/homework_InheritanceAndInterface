package inheritance_Interface.shape;

public class Circle extends AbstractShape implements Shape {
    private double radius;
    private double pi = 3.14;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getArea() {
        return pi*(radius*radius);
    }
}

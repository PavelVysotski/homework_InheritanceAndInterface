package inheritance_Interface.shape;

public class Square extends AbstractShape implements Shape{
    private double side1;
    private double side2;

    public Square(String name, double side1, double side2) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getArea() {
        return side1*side2;
    }
}

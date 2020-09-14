package inheritance_Interface.shape;

public class Triangle extends AbstractShape implements Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double semiPerimeter (){
        return (side1+side2+side3)/2;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getArea() {
        return Math.sqrt(semiPerimeter()*(semiPerimeter()-side1)*(semiPerimeter()-side2)*(semiPerimeter()-side3));
    }
}

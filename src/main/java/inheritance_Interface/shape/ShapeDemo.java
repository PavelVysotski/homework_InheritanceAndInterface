package inheritance_Interface.shape;

public class ShapeDemo {
    public static void main(String[] args) {

        Circle circle = new Circle("Круг", 5.8);
        Square square = new Square("Квадрат", 6, 8.2);
        Triangle triangle = new Triangle("Треугольник", 5.2, 3.4, 6.8);

        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = triangle;

        for (Shape shape : shapes) {
            System.out.println("Фигура: " + shape.getName() + ", Площадь:" + shape.getArea());
        }
    }
}

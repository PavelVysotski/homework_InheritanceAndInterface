package inheritance_Interface.math.operations;

public class SubtractionOperation implements MathOperation {


    @Override
    public double compute(double a, double b) {
        return a - b;
    }
}

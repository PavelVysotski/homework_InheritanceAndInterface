package inheritance_Interface.math.operations;

public class MultiplicationOperation implements MathOperation {


    @Override
    public double compute(double a, double b) {
        return a * b;
    }
}

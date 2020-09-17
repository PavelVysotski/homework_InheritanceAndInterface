package inheritance_Interface.math.operations;

public class AdditionalOperation implements MathOperation{


    @Override
    public double compute(double a, double b) {
        return a+b;
    }
}

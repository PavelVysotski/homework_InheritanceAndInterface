package inheritance_Interface.math.operations;

public class OperationExecutor {

    private double a;
    private double b;
    private MathOperation[] operations;

    public OperationExecutor() {
    }

    public void execute(MathOperation[] operations, double a, double b) {
        for (MathOperation ops : operations) {
            System.out.println(ops.compute(a, b));
        }
    }
}

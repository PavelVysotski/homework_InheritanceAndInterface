package inheritance_Interface.math.operations;

public class App {
    public static void main(String[] args) {


        MathOperation[] operations = {
                new AdditionalOperation(),
                new SubtractionOperation(),
                new MultiplicationOperation(),
                new DivideOperation()
        };
        OperationExecutor executor = new OperationExecutor();

        executor.execute(operations, 6,3);
    }
}

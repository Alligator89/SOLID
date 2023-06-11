package D;

public class AddOperation implements CalculatorOperation {
    @Override
    public void calculate(double numbA, double numB) {
        System.out.println(numbA + numB);
    }
}

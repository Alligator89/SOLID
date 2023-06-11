package D;

public class MultiplyOperation implements CalculatorOperation {
    @Override
    public void calculate(double numbA, double numB) {
        System.out.println(numbA * numB);
    }
}

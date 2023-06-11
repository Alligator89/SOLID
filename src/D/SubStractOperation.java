package D;

public class SubStractOperation implements CalculatorOperation {
    @Override
    public double calculate(double numbA, double numB) {
        return numbA - numB;
    }
}

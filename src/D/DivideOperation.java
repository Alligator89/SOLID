package D;

public class DivideOperation implements CalculatorOperation {
    @Override
    public void calculate(double numbA, double numB) {
        System.out.println(numbA / numB);
    }
}

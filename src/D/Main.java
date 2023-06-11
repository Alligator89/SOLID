package D;

public class Main {
    public static void main(String[] args) {
        AddOperation addOperation = new AddOperation();
        SubStractOperation subStractOperation = new SubStractOperation();
        MultiplyOperation multiplyOperation = new MultiplyOperation();
        DivideOperation divideOperation = new DivideOperation();
        addOperation.calculate(1, 2);
        subStractOperation.calculate(5, 1);
        multiplyOperation.calculate(4, 6);
        divideOperation.calculate(6, 3);
    }
}

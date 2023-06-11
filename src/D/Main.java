package D;

public class Main {
    public static void main(String[] args) {
    AddOperation addOperation=new AddOperation();
    DivideOperation divideOperation=new DivideOperation();
    MultiplyOperation multiplyOperation=new MultiplyOperation();
    SubStractOperation subStractOperation=new SubStractOperation();
        System.out.println(addOperation.calculate(2,3));
        System.out.println(divideOperation.calculate(9,3));
        System.out.println(multiplyOperation.calculate(3,4));
        System.out.println(subStractOperation.calculate(6,5));
    }
}

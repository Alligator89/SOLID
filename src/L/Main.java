package L;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        rectangle.setWidth(1);
        rectangle.setHeight(2);
        System.out.println(rectangle.getArea());
        square.setHeight(7);
        square.setWidth(7);
        System.out.println(square.getArea());
    }
}

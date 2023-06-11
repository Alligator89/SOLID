package O;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(3, 5);
        circle.lengthCircle();
        circle.calculateArea();
        rectangle.perimeter();
        rectangle.calculateArea();
    }
}

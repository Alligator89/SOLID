package O;

public class Rectangle extends Shape {
    public int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void perimeter() {
        System.out.println(2 * (width + height));
    }

    @Override
    public void calculateArea() {
        System.out.println(width * height);
    }
}

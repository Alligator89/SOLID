package O;

public class Circle extends Shape {
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    void lengthCircle() {
        System.out.println(2 * Math.PI * radius);
    }

    @Override
    public void calculateArea() {
        System.out.println(Math.PI * (Math.pow(radius, 2)));
    }
}

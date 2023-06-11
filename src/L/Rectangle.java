package L;

public class Rectangle {
    public int height;
    public int width;

    void setHeight(int height) {
        this.height = height;
    }

    void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return this.height * this.width;
    }
}

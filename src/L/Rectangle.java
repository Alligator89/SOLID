package L;

public class Rectangle {
    private int height;
    private int width;

    public void getArea() {
        System.out.println(height * width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

package L;

public class Square extends Rectangle {
    void setHeight(int height) {
        this.height = height;
        this.width = height;
    }

    void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    public int getArea() {
        return super.getArea();
    }
}

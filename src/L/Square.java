package L;

public class Square extends Rectangle {
    @Override
    public void setHeight(int value) {
        super.setWidth(value);
        super.setHeight(value);
    }

    @Override
    public void setWidth(int value) {
        super.setWidth(value);
        super.setHeight(value);
    }
}

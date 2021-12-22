package shape;

public class Rectangle extends Shape2D {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public float getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public float getArea() {
        return length * width;
    }

    @Override
    public String getShapeType() {
        return "rectangle";
    }
}

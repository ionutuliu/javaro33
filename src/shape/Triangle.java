package shape;

public class Triangle extends Shape2D {
    private int base;
    private int height;
    private int side1;
    private int side2;

    public Triangle(int side1, int side2, int base, int height) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public float getPerimeter() {
        return side1 + side2 + base;
    }

    @Override
    public float getArea() {
        return base * height / 2;
    }

    @Override
    public String getShapeType() {
        return "triangle";
    }
}

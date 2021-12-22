package shape;

public class Circle extends Shape2D {

    private int ray;

    Circle(int ray) throws Exception {
        if(ray <0) {
            throw new Exception("The ray of the circle should be a positive number");
        }
        this.ray = ray;
    }

    @Override
    public float getPerimeter() {
        return 3.14f * ray * ray;
    }

    @Override
    public float getArea() {
        return 2 * 3.14f * ray;
    }

    @Override
    public String getShapeType() {
        return "circle";
    }
}

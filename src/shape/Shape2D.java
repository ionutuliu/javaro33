package shape;

public abstract class Shape2D {

    public abstract float getPerimeter();

    public abstract float getArea();

    public void displayInfo() {
        System.out.println("I am a " + getShapeType() +
                " with perimeter " + getPerimeter() +
                " and area " + getArea() + ".");
    }

    public abstract String getShapeType();
}

package shape;

public class Main {

    public static void main(String[] args) {
        Shape2D[] shapes = new Shape2D[3];

        try {
            shapes[0] = new Circle(-3);
        } catch (Exception e) {
            System.out.println("Had an exception creating the circle");
            System.out.println(e.getMessage());
        }


        shapes[1] = new Rectangle(2, 4);
        shapes[2] = new Triangle(3, 4, 5, 3);
//        shapes[3] = new Triangle(3, 4, 5, 3);

        for (int i = 0; i < 3; i++) {
            if (shapes[i] != null) {
                shapes[i].displayInfo();
            }
        }
    }

    /*
    r1
    r2
    r3
    și
    l1
    L1
    l2
    L2


     */

}

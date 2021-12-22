package shape;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Shape2D[] shapes = new Shape2D[5];
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Dați raza cercului:");
            try {
                shapes[i] = new Circle(keyboard.nextInt());
            } catch (Exception e) {
                System.out.println("Valoare invalidă. Dați altă valoare");
                i--;
            }
        }

        for (int i = 3; i < 5; i++) {
            System.out.println("Dați lungimea și lațimea dreptunghiului:");
            try {
                shapes[i] = new Rectangle(keyboard.nextInt(), keyboard.nextInt());
            } catch (Exception e) {
                System.out.println("Valoare invalidă. Dați altă valoare");
                i--;
            }
        }

        for (int i = 0; i < 5; i++) {
            shapes[i].displayInfo();
        }

    }

}

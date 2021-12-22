package exemplu.interfata;

public class Duck extends Animal implements CanFly {


    @Override
    public void displaySkill() {
        System.out.println("Flip flom Mac Mac mac I'm a duck");
    }

    @Override
    public String fly() {
        return "Duck files >>>>";
    }
}

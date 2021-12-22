package exemplu.interfata;

public class DodoBird extends Animal implements CanFly{

    @Override
    public void displaySkill() {
        System.out.println("Dodod I'm a a dodo bird");
    }

    @Override
    public String fly() {
        return "Dodo flies";
    }
}

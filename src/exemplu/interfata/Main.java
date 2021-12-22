package exemplu.interfata;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Tiger();
        animals[1] = new Duck();
        animals[2] = new DodoBird();
        animals[3] = new Penguin();
        animals[4] = new DodoBird();

        displayAllAnimalsSkill(animals);
    }


    public static void displayAllAnimalsSkill(Animal[] animals) {
        for(int i = 0; i<5; i++) {
            animals[i].displaySkill();
            if(animals[i] instanceof CanFly){
                String fly = ((CanFly) animals[i]).fly();
                System.out.println(fly);
            }
        }
    }
}

package exemple;

import enums.Gen;
import level1.Persoana;

public class Angajat  extends Persoana {

    private String functia;

    public Angajat(String nume, String cnp, Gen gen, String functia) {
        super(nume, cnp, gen);
        this.functia = functia;
    }

    public String getFunctia() {
        return functia;
    }

    public void setFunctia(String functia) {
        this.functia = functia;
    }

    public String getPrezentare() {
        return "Salut! Eu sunt Angajat" + super.getPrezentare();
    }

    @Override
    public float getSumaDePlata() {
        return 0;
    }
}

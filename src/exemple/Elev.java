package exemple;

import enums.Gen;
import level1.Persoana;

public class Elev extends Persoana {
    private float medie;

    public float getMedie() {
        return medie;
    }

    public void setMedie(float medie) {
        this.medie = medie;
    }

    public Elev(String nume, String cnp, Gen gen, float medie) {
        super(nume, cnp, gen);
        this.medie = medie;
    }

    public String prezentareElev() {
        return "Salut! Eu sunt elev și mă numesc " + this.getNume() + " și am genul " + this.getGen();
    }

    @Override
    public float getSumaDePlata() {
        return 0;
    }
}

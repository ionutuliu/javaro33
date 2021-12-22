package level1;

import enums.Gen;

public abstract class Persoana {
    private String nume;
    private String cnp;
    private Gen gen;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCnp() {
        return cnp;
    }

    public Gen getGen() {
        return gen;
    }

    public void setGen(Gen gen) {
        this.gen = gen;
    }

    public Persoana(String nume, String cnp, Gen gen) {
        this.nume = nume;
        this.cnp = cnp;
        this.gen = gen;
    }

    public Persoana () {

    }

    public String getPrezentare() {
        return " și mă numesc " + nume + " si am genul " + gen;
    }

    public abstract float getSumaDePlata();
}


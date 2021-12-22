package exemple;

import enums.Gen;
import enums.Materie;
import level1.Persoana;

public class Profesor extends Persoana {
    private Materie materia;

    public Profesor(String nume, String cnp, Gen gen, Materie materia) {
        super(nume, cnp, gen);
        this.materia  = materia;
    }

    public Materie getMateria() {
        return materia;
    }

    public void setMateria(Materie materia) {
        this.materia = materia;
    }

    public String prezentareProfesor() {
        return "Salut! Eu sunt Profesor" + super.getPrezentare();
    }

    @Override
    public float getSumaDePlata() {
        return 0;
    }
}

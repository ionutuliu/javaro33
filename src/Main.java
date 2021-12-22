import enums.Gen;
import enums.Materie;
import exemple.Angajat;
import exemple.Elev;
import exemple.Profesor;

public class Main {

    public static void main(String[] args) {
        Elev ion = new Elev("Ion", "1231", Gen.MASCULIN, 6.6f);
        Profesor marcel = new Profesor("Marcel", "333", Gen.MASCULIN, Materie.FIZICA);
        Angajat valeriu = new Angajat("Valeriu", "234", Gen.MASCULIN, "Admin");
        ;

        System.out.println(marcel.getPrezentare());
        System.out.println(valeriu.getPrezentare());



    }




}

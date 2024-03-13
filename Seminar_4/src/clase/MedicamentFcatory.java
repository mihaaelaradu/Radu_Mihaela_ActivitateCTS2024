package clase;

import static clase.TipMediament.DURERE;
import static clase.TipMediament.RACEALA;

public class MedicamentFcatory {
    public static Medicament creareMedicament(TipMediament tip, String denumire, float pret, int valabilitate) throws Exception {
        switch(tip) {
            case BODY:
                return new Body(denumire, pret);
            case DURERE:
                return new Durere(denumire, pret);
            case RACEALA:
                return new Raceala(denumire, pret, valabilitate);
            case GRIPA:
                return new Gripa(denumire, pret);
            default:
                throw new Exception("Nu exista med");
        }
    }
}

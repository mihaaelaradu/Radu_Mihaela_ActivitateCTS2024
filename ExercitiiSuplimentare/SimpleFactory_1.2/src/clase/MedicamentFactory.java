package clase;

public class MedicamentFactory {

    public static MedicamentAbstract createMedicament(TipMedicament tipMedicament, String denumire, float pret) throws Exception {
        switch (tipMedicament) {
            case durere:
                return new Durere(denumire, pret);
            case raceala:
                return new Raceala(denumire, pret);
            case body:
                return new Body(denumire, pret);
            default:
                throw new Exception("Nu exista acets tip de mediament");
        }
    }
}

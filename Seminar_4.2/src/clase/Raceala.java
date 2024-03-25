package clase;

public class Raceala extends Medicament{

    public Raceala(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareMedicament() {
        System.out.printf("%s cost %f lei si este bun pentru raceala\n",
                super.getDenumire(),super.getPret());
    }
}

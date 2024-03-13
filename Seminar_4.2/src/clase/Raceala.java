package clase;

public class Raceala extends Medicament{
    private int cantitate;
    public Raceala(String denumire, float pret, int cantitate) {
        super(denumire, pret);
        this.cantitate = cantitate;
    }

    @Override
    public void afisareMedicament() {
        System.out.printf("%s cost %f lei si este bun pentru raceala\n",
                super.getDenumire(),super.getPret());
    }
}

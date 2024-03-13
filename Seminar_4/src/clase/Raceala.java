package clase;

public class Raceala extends Medicament{
    private int valabilitate;

    protected Raceala(String denumire, float pret) {
        super(denumire, pret);
        this.valabilitate = 0;
    }
    protected Raceala(String denumire, float pret, int valabilitate) {
        super(denumire, pret);
        this.valabilitate = valabilitate;
    }

    @Override
    public void afisareDetalii() {
        System.out.printf("%s cost %f si valabil %d zile", super.getDenumire(),super.getPret());
    }
}

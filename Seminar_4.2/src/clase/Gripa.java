package clase;

public class Gripa extends Medicament{
    @Override
    public void afisareMedicament() {
        System.out.printf("%s cost %f lei si este bun pentru gripa\n", super.getDenumire(),super.getPret());
    }

    public Gripa(String denumire, float pret) {
        super(denumire, pret);
    }
}

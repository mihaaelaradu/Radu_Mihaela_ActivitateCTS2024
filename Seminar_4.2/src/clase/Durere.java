package clase;

public class Durere extends Medicament{
    public Durere(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareMedicament() {
        System.out.printf("%s cost %f lei si este bun pentru duere\n", super.getDenumire(),super.getPret());
    }
}

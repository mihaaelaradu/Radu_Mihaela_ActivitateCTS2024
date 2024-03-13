package clase;


public class Body extends Medicament{
    public Body(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareMedicament() {
        System.out.printf("%s cost %f lei si este bun pentru body\n", super.getDenumire(),super.getPret());
    }
}

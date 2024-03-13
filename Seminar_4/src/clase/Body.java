package clase;

public class Body extends Medicament{
    protected Body(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.printf("%s cost %s", super.getDenumire(),super.getPret());
    }
}

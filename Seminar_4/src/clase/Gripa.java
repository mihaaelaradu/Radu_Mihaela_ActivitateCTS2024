package clase;

public class Gripa extends Medicament{

    public Gripa(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.printf("%s cost %s", super.getDenumire(),super.getPret());
    }
}

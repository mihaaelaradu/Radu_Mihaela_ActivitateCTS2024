package clase;

public class Body extends MedicamentAbstract{

    protected Body(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void descriere() {
        System.out.println("pt body" + super.getDenumire());
    }
}

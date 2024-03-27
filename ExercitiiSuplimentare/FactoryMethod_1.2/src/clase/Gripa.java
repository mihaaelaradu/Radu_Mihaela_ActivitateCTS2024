package clase;

public class Gripa extends Medicament{
    private int cantitate;
    public Gripa(String denumire, float pret, int cantitate) {
        super(denumire, pret);
        this.cantitate = cantitate;
    }

    public Gripa(String denumire, float pret) {
        super(denumire, pret);
        this.cantitate = 0;
    }

    @Override
    public String afisareDetalii() {
        return "Medicamentul pentru gripa " + super.getDenumire() + " are pretul de " + super.getPret() + "RON.";

    }
}

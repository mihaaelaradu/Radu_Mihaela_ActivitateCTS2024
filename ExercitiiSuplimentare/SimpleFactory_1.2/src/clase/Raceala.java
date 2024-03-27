package clase;

public class Raceala extends MedicamentAbstract {
    protected Raceala(String denumire, float pret) {
        super(denumire,pret);
    }
    @Override
    public void descriere() {
        System.out.println("Medicamentul " + super.getDenumire() + " este un medicament de tip Durere si are pretul de " + super.getPret() + " RON.");
    }
}
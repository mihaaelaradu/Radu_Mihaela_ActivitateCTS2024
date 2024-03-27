package clase;

public class Raceala extends Medicament{
    public Raceala(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public String afisareDetalii() {
        return "Medicamentul pentru raceala " + super.getDenumire() + " are pretul de " + super.getPret() + "RON.";

    }
}

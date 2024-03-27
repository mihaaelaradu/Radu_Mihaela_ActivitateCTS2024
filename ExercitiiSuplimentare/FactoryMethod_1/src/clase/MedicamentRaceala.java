package clase;

public class MedicamentRaceala implements Medicament{
    private String denumire;
    private double pret;

    public MedicamentRaceala(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void descriere() {
        System.out.println("Acest medicament este pentru Raceala");
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }
}

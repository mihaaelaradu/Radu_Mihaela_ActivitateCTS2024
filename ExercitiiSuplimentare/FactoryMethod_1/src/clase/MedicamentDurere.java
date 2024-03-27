package clase;

public class MedicamentDurere implements Medicament{
    private String denumire;
    private double pret;

    public MedicamentDurere(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void descriere() {
        System.out.println("Acest medicament este pentru Durere");
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }
}

package clase;

public class MedicamentBody implements Medicament{
    private String denumire;
    private double pret;

    public MedicamentBody(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void descriere() {
        System.out.println("Acest medicament este pentru Body");
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }
}

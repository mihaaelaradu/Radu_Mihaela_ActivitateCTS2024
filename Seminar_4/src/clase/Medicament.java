package clase;

public abstract class Medicament {
    private String denumire;
    private float pret;

    public Medicament(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getPret() {
        return pret;
    }

    @Override
    public abstract void afisareDetalii();
        System.out.println("%s costa %f si este bun pentru corp", this.getDenumire(), this.getPret())
}

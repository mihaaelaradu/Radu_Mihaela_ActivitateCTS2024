package clase;

public abstract class MedicamentAbstract {

    private String denumire;
    private float pret;

    public String getDenumire() {
        return denumire;
    }
    public float getPret() {
        return pret;
    }

    public MedicamentAbstract(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }
    public abstract void descriere();
}

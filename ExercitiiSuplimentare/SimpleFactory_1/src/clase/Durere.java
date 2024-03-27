package clase;

public class Durere implements MedicamentAbstract{

    private String denumire;
    private float pret;

    public Durere(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }
    @Override
    public void descriere() {
        System.out.println("Acest medicament este pentru durere" + this.denumire + "si are pretul de " + this.pret);
    }
}

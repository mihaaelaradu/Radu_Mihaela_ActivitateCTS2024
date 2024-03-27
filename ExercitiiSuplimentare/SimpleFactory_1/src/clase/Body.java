package clase;

public class Body implements MedicamentAbstract{

    private String denumire;
    private float pret;

    public Body(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void descriere() {
        System.out.println("Acest medicament este pentru body");
    }
}

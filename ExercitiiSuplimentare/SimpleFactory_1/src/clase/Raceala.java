package clase;

public class Raceala implements MedicamentAbstract{

    private String denumire;
    private float pret;

    public Raceala(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void descriere() {
        System.out.println("Acest medicament este pentru racela");
    }

}

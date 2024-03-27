package clase;

public class Manager {

    private String nume;
    private float procentaj;
    private double salariu;
    private static Manager instanta = null;   //foarte importanta sa fie STATIC

    private Manager(String nume, float procentaj, double salariu) {   //sa fie PRIVAT
        this.nume = nume;
        this.procentaj = procentaj;
        this.salariu = salariu;
    }

    public static synchronized Manager getInstanta(String nume, float procentaj, double salariu){ // SYNCHRONIZED
        if(instanta == null)
            instanta = new Manager(nume,procentaj,salariu);
        return instanta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getProcentaj() {
        return procentaj;
    }

    public void setProcentaj(float procentaj) {
        this.procentaj = procentaj;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }
}

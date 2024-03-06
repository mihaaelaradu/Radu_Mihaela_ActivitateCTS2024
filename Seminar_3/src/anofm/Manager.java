package anofm;

public class Manager {
    private String nume;
    private String numeManager;
    private float salariu;

     protected Manager(String nume, String numeManager, float salariu) {               //am pus protected sa nu mai pot crea in main instante aiuera, dar sa il pot folsi in registy
        this.nume = nume;
        this.numeManager = numeManager;
        this.salariu = salariu;
    }

    public void setNumeManager(String numeManager) {
        this.numeManager = numeManager;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "nume='" + nume + '\'' +
                ", numeManager='" + numeManager + '\'' +
                ", salariu=" + salariu +
                '}';
    }
}

package clase;

public class Reteta {
    private String numeReteta;
    private int suma;
    private int nrMedicament;

    public Reteta(String numeReteta, int suma, int nrMedicament) {
        this.numeReteta = numeReteta;
        this.suma = suma;
        this.nrMedicament = nrMedicament;
    }

    public String getNumeReteta() {
        return numeReteta;
    }

    public int getSuma() {
        return suma;
    }

    public int getNrMedicament() {
        return nrMedicament;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "numeReteta='" + numeReteta + '\'' +
                ", suma=" + suma +
                ", nrMedicament=" + nrMedicament +
                '}';
    }
}

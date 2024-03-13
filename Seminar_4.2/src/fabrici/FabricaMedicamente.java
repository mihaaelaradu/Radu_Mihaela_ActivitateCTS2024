package fabrici;

import clase.Medicament;

public abstract class FabricaMedicamente {
    private String denumire;
    private float pret;

    public FabricaMedicamente(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public abstract Medicament creareMedicament();

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }
}

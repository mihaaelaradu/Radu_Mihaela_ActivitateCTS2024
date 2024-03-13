package fabrici;

import clase.Gripa;
import clase.Medicament;

public class FabricaGripa extends FabricaMedicamente{
    private int cantitate;

    public FabricaGripa(String denumire, float pret, int cantitate) {
        super(denumire, pret);
        this.cantitate = cantiate;
    }

    @Override
    public Medicament creareMedicament() {
        return new Gripa(super.getDenumire(), super.getPret(), cantitate)
    }
}

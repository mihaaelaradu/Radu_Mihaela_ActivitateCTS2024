package fabrici;

import clase.Gripa;
import clase.Medicament;

public class FabricaGripa extends FabricaMedicamente{
    private int cantitate;
    public FabricaGripa(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public Medicament createMedicament() {
        return new Gripa(super.getDenumire(),super.getPret(), cantitate);
    }
}

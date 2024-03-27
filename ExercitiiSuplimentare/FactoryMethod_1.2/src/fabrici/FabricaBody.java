package fabrici;

import clase.Body;
import clase.Medicament;

public class FabricaBody extends FabricaMedicamente{
    public FabricaBody(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public Medicament createMedicament() {
        return new Body(super.getDenumire(),super.getPret());
    }
}

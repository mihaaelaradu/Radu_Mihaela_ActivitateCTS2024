package fabrici;

import clase.Durere;
import clase.Medicament;

public class FabricaDurere extends FabricaMedicamente{
    public FabricaDurere(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public Medicament createMedicament() {
        return new Durere(super.getDenumire(),super.getPret());
    }
}

package fabrici;

import clase.Durere;
import clase.Medicament;

public class FabricaRaceala extends FabricaMedicamente{
    public FabricaRaceala(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public Medicament creareMedicament() {
        return new Durere(super.getDenumire(), super.getPret());
    }
}

package fabrici;

import clase.Medicament;
import clase.Raceala;

public class FabricaRaceala extends FabricaMedicamente{
    public FabricaRaceala(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public Medicament createMedicament() {
        return new Raceala(super.getDenumire(),super.getPret());
    }
}

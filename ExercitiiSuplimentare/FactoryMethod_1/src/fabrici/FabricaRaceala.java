package fabrici;

import clase.Medicament;
import clase.MedicamentRaceala;

public class FabricaRaceala implements Fabrica{
    @Override
    public Medicament createMedicament(String denumire, double pret) {
        return new MedicamentRaceala(denumire, pret);
    }
}

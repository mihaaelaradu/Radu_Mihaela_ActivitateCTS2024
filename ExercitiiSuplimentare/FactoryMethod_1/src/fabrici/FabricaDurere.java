package fabrici;

import clase.Medicament;
import clase.MedicamentDurere;

public class FabricaDurere implements Fabrica{
    @Override
    public Medicament createMedicament(String denumire, double pret) {
        return new MedicamentDurere(denumire, pret);
    }
}

package fabrici;

import clase.Medicament;
import clase.MedicamentBody;

public class FabricaBody implements Fabrica{
    @Override
    public Medicament createMedicament(String denumire, double pret) {
        return new MedicamentBody(denumire, pret);
    }
}

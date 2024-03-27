package fabrici;

import clase.Medicament;

public interface Fabrica {
    public Medicament createMedicament(String denumire, double pret);
}

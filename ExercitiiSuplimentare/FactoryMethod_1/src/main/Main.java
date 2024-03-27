package main;

import clase.Medicament;
import fabrici.Fabrica;
import fabrici.FabricaRaceala;

public class Main {
    public static void main(String[] args) {
        Fabrica fabricaRaceala = new FabricaRaceala();
        Medicament med1 = fabricaRaceala.createMedicament("Paracetamol", 34.5);

        med1.descriere();
    }
}

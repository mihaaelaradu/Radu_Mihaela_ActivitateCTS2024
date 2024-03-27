package main;

import clase.Medicament;
import fabrici.FabricaDurere;
import fabrici.FabricaGripa;
import fabrici.FabricaMedicamente;
import fabrici.FabricaRaceala;

public class Main {
    public static void main(String[] args) {
        FabricaMedicamente fabricaRaceala = new FabricaRaceala("Paracetamol", 10);
        Medicament med_1 = fabricaRaceala.createMedicament();
        FabricaMedicamente fabricaDurere = new FabricaDurere("Ibuprofen", 15);
        Medicament med_2 = fabricaDurere.createMedicament();
        FabricaGripa fabricaGripa = new FabricaGripa("Aspirina", 20);
        Medicament med_3 = fabricaGripa.createMedicament();
        System.out.println(med_1.afisareDetalii());
        System.out.println(med_2.afisareDetalii());
        System.out.println(med_3.afisareDetalii());

        FabricaMedicamente fabricaMedicamente = new FabricaRaceala("Paracetamol", 10);
        procesareMedicament(fabricaMedicamente);
        fabricaMedicamente = new FabricaGripa("Aspirina", 20);
        procesareMedicament(fabricaMedicamente);
    }
        public static void procesareMedicament(FabricaMedicamente fabricaMedicamente)
        {
            Medicament med = fabricaMedicamente.createMedicament();
            System.out.println(med.afisareDetalii());
        }

}

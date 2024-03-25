package main;

import clase.Medicament;
import fabrici.FabricaBody;
import fabrici.FabricaDurere;
import fabrici.FabricaGripa;
import fabrici.FabricaMedicamente;

public class Main {
    public static void main(String[] args) {
        FabricaMedicamente fabricaDurere = new FabricaDurere("Agocalmin", 12.0f);
        Medicament medicamentDurere = fabricaDurere.creareMedicament();
        medicamentDurere.afisareMedicament();

        FabricaMedicamente fabrica = new FabricaBody("medicament", 33.4f);
        procesareMedicament(fabrica);

        procesareMedicament(new FabricaGripa( "paracetamol", 8.0f, 6));
    }

    public static void procesareMedicament(FabricaMedicamente fabricaMedicamente){
       Medicament medicament = fabricaMedicamente.creareMedicament();
       medicament.afisareMedicament();
    }
}

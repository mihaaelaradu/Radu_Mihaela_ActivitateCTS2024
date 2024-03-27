package main;

//1. Farmacia dorește ca toate medicamentele să facă parte dintr-o categorie. Categoriile sunt salvate
//într-un enum {Raceala, Durere, Body}. Fiecare medicament o sa aibă preț și denumire. Să se
//implementeze modul care va inițializa obiecte din familia medicamentelor.


import clase.MedicamentAbstract;
import clase.MedicamentFactory;
import clase.TipMedicament;

public class Main {
    public static void main(String[] args) {
        MedicamentAbstract med_1 = null;
        try {
            med_1 = MedicamentFactory.createMedicament(TipMedicament.body, "Nivea", 20);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        med_1.descriere();


    }
}
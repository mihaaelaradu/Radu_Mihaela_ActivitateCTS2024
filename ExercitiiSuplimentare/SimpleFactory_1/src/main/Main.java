package main;

//1. Farmacia dorește ca toate medicamentele să facă parte dintr-o categorie. Categoriile sunt salvate
//într-un enum {Raceala, Durere, Body}. Fiecare medicament o sa aibă preț și denumire. Să se
//implementeze modul care va inițializa obiecte din familia medicamentelor.


import clase.MedicamentAbstract;
import clase.MedicamentFactory;
import clase.TipMedicament;

public class Main {
    public static void main(String[] args) {

        MedicamentFactory medicamentFactory = new MedicamentFactory();
        MedicamentAbstract medicamentAbstract = null;

        try {
            medicamentAbstract = medicamentFactory.createMedicament(TipMedicament.durere,"Nurofen",34.6f);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        medicamentAbstract.descriere();
    }

}

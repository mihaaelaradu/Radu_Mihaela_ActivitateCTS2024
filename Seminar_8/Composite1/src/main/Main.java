package main;

import clase.Categorie;
import clase.Medicament;
import clase.StructuraAbstracta;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta medicament =  new Categorie("Medicamente");

        StructuraAbstracta raceala =  new Categorie("Raceaala");
        StructuraAbstracta duerere =  new Categorie("Durere");

        StructuraAbstracta copil =  new Categorie("Copil");
        StructuraAbstracta adulti =  new Categorie("Adulti");

        StructuraAbstracta nurofen =  new Medicament("Nurofen", 15.0);
        StructuraAbstracta paracetamol =  new Medicament("Paracetamol", 1.5);
        StructuraAbstracta mig400 =  new Medicament("Mig400", 20.0);

        medicament.adaugaCategorie(raceala);
        medicament.adaugaCategorie(duerere);

        raceala.adaugaCategorie(copil);
        raceala.adaugaCategorie(adulti);

        duerere.adaugaCategorie(mig400);

        copil.adaugaCategorie(nurofen);
        adulti.adaugaCategorie(paracetamol);

        medicament.afisareProspect("   ");
        medicament.calculeazaPret(0.1);
    }
}

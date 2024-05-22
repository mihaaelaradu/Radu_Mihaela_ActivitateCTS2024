package main;

import clase.CategorieComposite;
import clase.ComponentaAbstracta;
import clase.Medicament;

public class Main {
    public static void main(String[] args) {
        ComponentaAbstracta medicamente = new CategorieComposite("Medicamente");

        ComponentaAbstracta raceala = new CategorieComposite("Raceala");
        ComponentaAbstracta durere = new CategorieComposite("Durere");


        ComponentaAbstracta adulti = new CategorieComposite("Adulti");
        ComponentaAbstracta copii = new CategorieComposite("Copii");

        ComponentaAbstracta nurofen = new Medicament("Nurofen", 12);
        ComponentaAbstracta paracetamol = new Medicament("Paracetamol", 11);
        ComponentaAbstracta sirop = new Medicament("Sirop", 10);

        medicamente.adaugaCategorie(raceala);
        medicamente.adaugaCategorie(durere);

        raceala.adaugaCategorie(adulti);
        raceala.adaugaCategorie(copii);

        adulti.adaugaCategorie(nurofen);
        copii.adaugaCategorie(paracetamol);

        durere.adaugaCategorie(sirop);

        medicamente.descriere();



    }
}

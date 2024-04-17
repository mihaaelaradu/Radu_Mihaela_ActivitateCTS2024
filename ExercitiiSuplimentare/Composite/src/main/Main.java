package main;

import clase.Departament;
import clase.Sectie;
import clase.StructuraAbstracta;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta spital = new Departament("Spital", "Anabela Ion");

        StructuraAbstracta cardiologie = new Departament("Cardiologie", "Alex Bob");
        StructuraAbstracta neurologie = new Departament("Neurologie", "Sofia Pop");

        StructuraAbstracta terapieIntensiva = new Sectie("ATI", 12, "Toma Tomescu");
        StructuraAbstracta donare = new Sectie("Donare de sange", 5,"Maria Ion");
        StructuraAbstracta ct = new Sectie("CT", 9, "Radu Noe");

        cardiologie.adaugaStructura(terapieIntensiva);
        cardiologie.adaugaStructura(donare);

        neurologie.adaugaStructura(ct);

        spital.adaugaStructura(cardiologie);
        spital.adaugaStructura(neurologie);

        spital.afiseazaDescriere(" ");
    }
}

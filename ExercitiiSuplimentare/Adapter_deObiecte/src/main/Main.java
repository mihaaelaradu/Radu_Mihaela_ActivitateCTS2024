package main;

import soft.adapter.PachetMasinaInchiriata;
import soft.nou.Masina;
import soft.nou.MasinaInchiriata;
import soft.vechi.PachetCazare;
import soft.vechi.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        Masina masina = new Masina("bmw", 23.4);
        MasinaInchiriata inchiriereMasina = new MasinaInchiriata(masina);

        inchiriereMasina.inchiriazaMasina();
        inchiriereMasina.toString();

        PachetTuristic pachet1 = new PachetCazare();
        PachetTuristic pachet2 = new PachetMasinaInchiriata(inchiriereMasina);

        pachet1.rezervaPachet();
        pachet1.descriere();

        pachet2.rezervaPachet();
        pachet2.descriere();
    }
}

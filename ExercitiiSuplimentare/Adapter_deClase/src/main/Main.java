package main;

import clase.Masina;
import clase.PachetCazare;
import clase.PachetInchiriereMasina;
import clase.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        Masina masina = new Masina("audi", 12.4f);

        PachetTuristic pachet1 = new PachetCazare();
        PachetTuristic pachet2 = new PachetInchiriereMasina(masina);

        pachet1.rezervarePachet();
        pachet1.descriere();

        pachet2.rezervarePachet();
        pachet2.descriere();
    }
}

package main;

import clase.Client;
import clase.VerificatorPeluza;
import clase.VerificatorTribuna;
import clase.VerificatorVIP;


//MAI MULTI ALGORITMI PENTRU REZOLVAREA PROBLEMIE
//ALEGEM METODA LA RUN-TIME

public class Main {
    public static void main(String[] args) {

        Client portar = new Client();

        portar.setStrategie(new VerificatorPeluza());
        portar.verificaSuporter("Ana");

        portar.setStrategie(new VerificatorTribuna());
        portar.verificaSuporter("Cornel");

        portar.setStrategie(new VerificatorVIP());
        portar.verificaSuporter("Ion");
    }
}

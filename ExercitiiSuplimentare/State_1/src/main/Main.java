package main;

import clase.Rezervare;
import clase.Stare;
import clase.StareEfectuata;
import clase.StarePlatita;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(1);

        Stare stare1 = new StareEfectuata();
        stare1.doAction(rezervare1);

        Stare stare2 = new StarePlatita();
        stare2.doAction(rezervare1);


    }
}

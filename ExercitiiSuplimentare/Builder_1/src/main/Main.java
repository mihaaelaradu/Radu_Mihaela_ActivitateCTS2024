package main;

import clase.Rezervare;
import clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new RezervareBuilder().build();
        Rezervare rezervare2 = new RezervareBuilder()
                .setHasMuzica(true).setGenMuzical("Rock").build();
        Rezervare rezervare3 = new Rezervare();

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
        System.out.println(rezervare3.toString());
    }
}

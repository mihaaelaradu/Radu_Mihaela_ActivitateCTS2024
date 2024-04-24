package main;

import clase.Cash;
import clase.Client;
import clase.ModPlata;


//B11
public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Ion");
        ModPlata modPlata = new Cash();
        client1.realizarePlata(10);
        client1.setModPlata(modPlata);
        client1.realizarePlata(20);

    }
}

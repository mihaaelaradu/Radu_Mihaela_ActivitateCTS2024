package main;

import clase.AbstractPrototype;
import clase.Client;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaAccesprii = new ArrayList<>();
        listaAccesprii.add("Casti");
        listaAccesprii.add("Boxa");
        Client client1 = new Client("Ana", 18,listaAccesprii);

        Client client2 = (Client) client1.clone();
        client2.setVarsta(34);

        System.out.println(client1.toString());
        System.out.println(client2.toString());
    }
}

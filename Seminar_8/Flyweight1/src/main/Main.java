package main;

import clase.Fabrica;
import clase.Flyweight;
import clase.Reteta;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();

        Reteta reteta1 = new Reteta("reteta1", 13, 1);
        Reteta reteta2 = new Reteta("reteta2", 10, 2);
        Reteta reteta3 = new Reteta("reteta3", 15, 3);
        Reteta reteta4 = new Reteta("reteta4", 20, 4);

        Flyweight client = fabrica.getClient("123455", "Gigel");

        client.achizitioneazaReteta(reteta1);

        fabrica.getClient("123455","Gigel").achizitioneazaReteta(reteta2);

        fabrica.getClient("98765", "Ana").achizitioneazaReteta(reteta3);

        client.achizitioneazaReteta(reteta4);

    }
}

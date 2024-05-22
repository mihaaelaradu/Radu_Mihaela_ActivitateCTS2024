package main;

import soft.adapter.AdapterMetroSTB;
import soft.nou.BiletMetro;
import soft.nou.SoftMetrou;
import soft.vechi.BiletCardCalatorii;
import soft.vechi.SoftSTB;

public class Main {
    public static void main(String[] args) {
        SoftSTB bilet1 = new BiletCardCalatorii("Ana", 12);
        bilet1.validareCalatorie();

        SoftMetrou bilet2 = new BiletMetro("Maria", 0);
        if(bilet2.estePermisAccesul()){
            System.out.println("Calatorie placuta!");
        }else{
            System.out.println("Sold calatorii insuficient.");
        }

        SoftSTB bilet3 = new AdapterMetroSTB(bilet2);
        bilet3.validareCalatorie();
    }
}

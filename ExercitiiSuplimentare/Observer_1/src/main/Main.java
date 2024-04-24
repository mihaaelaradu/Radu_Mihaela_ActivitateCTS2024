package main;

import clase.SalaDeSport;
import clase.Stadion;
import clase.Subiect;
import observer.Abonat;
import observer.Observer;
import observer.Vecini;


//RELATIE DE 1:N
//UN SUBIECT NOTIFICA MAI MULTI OBSERVERI DE O SCHIMBARE

public class Main {
    public static void main(String[] args) {
        Subiect salaDeSport = new SalaDeSport();

        Observer abonat1 = new Abonat("abonat1");
        Observer abonat2 = new Abonat("abonat2");
        Observer abonat3 = new Abonat("abonat3");
        Observer abonat4 = new Vecini("abonat4", 34);

        salaDeSport.adaugaAbonat(abonat1);
        salaDeSport.adaugaAbonat(abonat2);
        salaDeSport.adaugaAbonat(abonat3);
        salaDeSport.adaugaAbonat(abonat4);

        salaDeSport.notificaMeciFotbal();
        salaDeSport.notificaMeciHandball();

        salaDeSport.stergeAbonat(abonat2);
        salaDeSport.notificaObservator("MESAJ");

        Subiect stadion = new Stadion();
        stadion.adaugaAbonat(abonat1);
        stadion.adaugaAbonat(abonat2);
        stadion.adaugaAbonat(abonat4);

        ((Stadion) stadion).notificaConcert();
    }
}

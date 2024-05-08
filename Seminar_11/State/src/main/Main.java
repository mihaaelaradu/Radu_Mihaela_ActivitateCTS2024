package main;


import clase.Reteta;

//ex 13 C
public class Main {
    public static void main(String[] args) {
        Reteta reteta1 = new Reteta(1234, 5);

        reteta1.solicitaMedicament();

        reteta1.respingeAchizite();
        reteta1.cumparaMedicamente();

        reteta1.solicitaMedicament();
        reteta1.cumparaMedicamente();
    }
}

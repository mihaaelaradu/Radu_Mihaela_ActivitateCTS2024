package main;

//ex 3 din E


import Builder.Rezervare;
import Builder.RezervareBuilder;

public class Main {
    public static void main(String[] args) {

        RezervareBuilder rezervareBuilder =  new RezervareBuilder();
        Rezervare rezervare =  rezervareBuilder.adaugaMancare().adaugaBautura().build();

        //rezervare.setAreScaunErgonomic(true);
        Rezervare rezervare1 =  rezervareBuilder.adaugaMuzica().adaugaGenMuzical("rock").build();

        System.out.println(rezervare);
        System.out.println(rezervare1);
    }
}

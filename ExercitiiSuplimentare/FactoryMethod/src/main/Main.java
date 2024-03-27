package main;

import clase.PachetTuristic;
import fabrici.Factory;
import fabrici.FactoryPachetAllInclusive;

public class Main {

    private static void afisare(Factory factory){
        PachetTuristic pachetTuristic = factory.createPachet();
        pachetTuristic.descriere();
    }

    public static void main(String[] args) {
        afisare(new FactoryPachetAllInclusive());
    }
}



//Factory factory = new FactoryPachetAllInclusive();
//PachetTuristic pachetTuristic = null;
//pachetTuristic = factory.createPachet();
//        pachetTuristic.descriere();
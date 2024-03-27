package main;

import clase.Fabrica;
import clase.InterfataPersonalSpital;
import clase.Medic;

import static clase.TipPersonalSpital.MEDIC;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        InterfataPersonalSpital interfataPersonalSpital = null;
        try {
            interfataPersonalSpital = fabrica.getPersonalSpital(MEDIC);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        interfataPersonalSpital.descriere();

    }
}

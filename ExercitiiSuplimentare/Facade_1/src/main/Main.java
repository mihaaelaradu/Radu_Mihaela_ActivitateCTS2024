package main;

import clase.Facade;

public class Main {
    public static void main(String[] args) {

        System.out.println(Facade.verificareDisponibilitateCamera(1));
        System.out.println(Facade.verificareDisponibilitateCamera(9));
        System.out.println(Facade.verificareDisponibilitateCamera(14));
    }
}

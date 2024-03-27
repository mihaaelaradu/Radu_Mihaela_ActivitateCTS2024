package main;

import clase.Sesiune;

public class Main {
    public static void main(String[] args) {
        Sesiune sesiune1 = Sesiune.getInstanta("Ana");
        Sesiune sesiune2 = Sesiune.getInstanta("Analiii");

        System.out.println(sesiune1);
        System.out.println(sesiune2);

    }
}

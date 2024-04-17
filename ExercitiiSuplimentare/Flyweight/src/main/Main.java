package main;

import clase.CaracteristiciOptionale;
import clase.Fabrica;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        CaracteristiciOptionale c1 = new CaracteristiciOptionale(10, 10, "Roz");
        CaracteristiciOptionale c2 = new CaracteristiciOptionale(10, 15, "Verde");
        CaracteristiciOptionale c3 = new CaracteristiciOptionale(15, 30, "Alb");
        CaracteristiciOptionale c4 = new CaracteristiciOptionale(17, 18, "Albastru");

        fabrica.getSpectatori(10, 10).deseneaza(c1);
        fabrica.getSpectatori(20, 10).deseneaza(c2);
        fabrica.getSpectatori(10, 10).deseneaza(c3);
        fabrica.getSpectatori(20, 10).deseneaza(c4);
    }
}

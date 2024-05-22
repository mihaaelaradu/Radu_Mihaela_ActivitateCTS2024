package main;

import clase.Bilet;
import clase.BiletAbstract;
import clase.DecoratorAbstrcat;
import clase.DecoratorConcret;

public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet1 = new Bilet(123);
        DecoratorAbstrcat bilet2 = new DecoratorConcret(bilet1);

        bilet1.printeazaBilet();

        bilet2.printeazaBilet();
        bilet2.printareLMA();
    }
}

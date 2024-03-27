package main;

import clase.AbstractFactory;
import clase.FabricaVita;
import clase.InterfatSupa;
import clase.Vita;

public class Main {
    public static void main(String[] args) {

        AbstractFactory fabrica = new FabricaVita();
        InterfatSupa vita = fabrica.getSupa();
    }
}

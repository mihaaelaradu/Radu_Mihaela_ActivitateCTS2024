package main;

import clase.AbstractBuilder;
import clase.Factura;
import clase.FacturaBuilder;

public class Main {
    public static void main(String[] args) {
        Factura factura1 = new Factura(3,true, false,4f);
        AbstractBuilder abstractBuilder =  new FacturaBuilder();
        Factura factura2 = abstractBuilder.adaugaFactura();

        System.out.println(factura1.toString());
        System.out.println(factura2.toString());
    }
}

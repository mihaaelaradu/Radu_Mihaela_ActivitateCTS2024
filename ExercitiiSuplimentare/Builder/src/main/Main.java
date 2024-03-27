package main;

import clase.PachetTransport;
import clase.PachetTransportBuilder;

public class Main {
    public static void main(String[] args) {
        PachetTransport pachetTransport = new PachetTransportBuilder()
                .setFumator(true).setHasAC(true).setHasAnimale(true).build();

        System.out.println(pachetTransport.toString());

        PachetTransport pt = new PachetTransport();
        pt.setFumator(true);

        System.out.println(pt.toString());
    }
}

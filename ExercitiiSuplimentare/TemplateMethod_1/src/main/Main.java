package main;

import clase.PachetCazareTransport;
import clase.PachetTransport;
import clase.PachetTuristic;

public class Main {
    public static void main(String[] args) {

        PachetTuristic pachet1 = new PachetTransport(1234);
        pachet1.vindePachet();

        PachetTuristic pachet2 = new PachetCazareTransport(9876);
        pachet2.vindePachet();
    }
}

package clase;

import java.util.HashMap;
import java.util.Map;

public class Banca {
    private String nume;
    private double capital;
    private Map<String, Flyweight> listaClienti;

    public Banca(String nume, double capital) {
        this.nume = nume;
        this.capital = capital;
        this.listaClienti = new HashMap<>();
    }

}

package clase;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    private Map<String, Flyweight> listClienti;

    public Fabrica() {
        this.listClienti = new HashMap<>();
    }

    public Flyweight getClient(String numarAsigurare, String nume) {
        if (!listClienti.containsKey(numarAsigurare)) {
            listClienti.put(numarAsigurare, new Client(nume, numarAsigurare));
        }
        return listClienti.get(numarAsigurare);
    }
}

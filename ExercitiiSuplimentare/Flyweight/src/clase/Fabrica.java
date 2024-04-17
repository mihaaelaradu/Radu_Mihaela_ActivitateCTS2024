package clase;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    private Map< String, Flyweight> spectatori;


    public Fabrica() {
        this.spectatori = new HashMap<String, Flyweight>();
    }

    public Flyweight getSpectatori(int inaltime, int latime){
        String cheie = String.valueOf(inaltime) + " " + String.valueOf(latime);

        if(spectatori.containsKey(cheie)){
            return spectatori.get(cheie);
        } else{
            Flyweight spectator = new Spectator(latime,inaltime);
            return spectator;
        }
    }

}

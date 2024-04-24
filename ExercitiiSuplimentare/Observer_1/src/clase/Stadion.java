package clase;

import java.util.ArrayList;

public class Stadion extends Subiect{

    public Stadion() {
        super.listaObservatori = new ArrayList<>();
    }

    @Override
    public void notificaMeciFotbal() {
        super.notificaObservator("Va fi meci de forbal pe 33 mai");
    }

    @Override
    public void notificaMeciVoley() {
        super.notificaObservator("Va fi meci de volley pe 44 mai");
    }

    @Override
    public void notificaMeciHandball() {
        super.notificaObservator("Va fi meci de handball pe 55 mai");
    }

    public void notificaConcert(){
        super.notificaObservator("Azi va fi concert.");
    }
}

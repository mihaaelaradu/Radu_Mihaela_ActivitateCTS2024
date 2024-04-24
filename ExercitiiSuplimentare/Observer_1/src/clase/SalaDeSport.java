package clase;

import java.util.ArrayList;

public class SalaDeSport extends Subiect{


    public SalaDeSport() {
        super.listaObservatori = new ArrayList<>();
    }

    @Override
    public void notificaMeciFotbal() {
        super.notificaObservator("Va fi meci de forbal pe 3 mai");
    }

    @Override
    public void notificaMeciVoley() {
        super.notificaObservator("Va fi meci de volley pe 4 mai");
    }

    @Override
    public void notificaMeciHandball() {
        super.notificaObservator("Va fi meci de handball pe 5 mai");
    }
}

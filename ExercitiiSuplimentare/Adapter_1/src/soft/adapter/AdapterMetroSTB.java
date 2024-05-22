package soft.adapter;

import soft.nou.SoftMetrou;
import soft.vechi.SoftSTB;

public class AdapterMetroSTB extends SoftSTB {
    private SoftMetrou softMetrou;

    public AdapterMetroSTB(String numeClient) {
        super(numeClient);
    }

    public AdapterMetroSTB(SoftMetrou softMetrou) {
        super(softMetrou.getNumeclient());
        this.softMetrou = softMetrou;
    }


    @Override
    public void validareCalatorie() {
        if(softMetrou.estePermisAccesul()){
            System.out.println("Calatorie placuta!");
        } else {
            System.out.println("Fonduuri insuficiente.");
        }
    }
}

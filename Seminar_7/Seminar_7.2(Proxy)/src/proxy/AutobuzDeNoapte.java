package proxy;

import clase.Autobuz;
import clase.AutobuzAbstract;

public class AutobuzDeNoapte implements AutobuzAbstract {
    private AutobuzAbstract autobuz ;

    public AutobuzDeNoapte(AutobuzAbstract autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie(String statie) {
        if(autobuz.getNrCalatori() > 0){
            autobuz.opresteInStatie(statie);
        }
        else {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " nu mai opreste in statie");
        }
    }

    @Override
    public int getNrAutobuz() {
        return autobuz.getNrAutobuz();
    }

    @Override
    public int getNrCalatori() {
        return autobuz.getNrCalatori();
    }

}

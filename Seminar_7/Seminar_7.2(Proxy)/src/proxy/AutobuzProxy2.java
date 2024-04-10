package proxy;

import clase.AutobuzAbstract;

import java.util.ArrayList;
import java.util.List;

public class AutobuzProxy2 implements AutobuzAbstract {

    List<String> statiiinterzise = new ArrayList<>();
    private AutobuzAbstract autobuz;

    public AutobuzProxy2(AutobuzAbstract autobuz) {
        this.autobuz = autobuz;
    }

    public void adaugaStatie(String statie){
        statiiinterzise.add(statie);
    }

    @Override
    public void opresteInStatie(String statie) {
        if(statiiinterzise.contains(statie)){
            System.out.println("Autobuzul " + getNrAutobuz() + "nu mai opreste in statiea " + statie);
        }
        else {
            autobuz.opresteInStatie(statie);
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

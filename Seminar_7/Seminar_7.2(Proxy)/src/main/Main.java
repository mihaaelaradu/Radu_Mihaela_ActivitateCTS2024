package main;

import clase.Autobuz;
import clase.AutobuzAbstract;
import proxy.AutobuzDeNoapte;
import proxy.AutobuzProxy2;

public class Main {
    public static void main(String[] args) {
        AutobuzAbstract autobuz = new Autobuz(11, 2345, "Aurel");
        autobuz.opresteInStatie("Izvor");

        AutobuzAbstract autobuz1 = new AutobuzDeNoapte(autobuz);
        autobuz1.opresteInStatie("Romana");

        AutobuzAbstract autobuz2 = new Autobuz(0, 555, "Laur");
        autobuz2.opresteInStatie("Eroilor");

        AutobuzAbstract autobuz3 = new AutobuzDeNoapte(autobuz2);
        autobuz3.opresteInStatie("Victoriei");

        AutobuzProxy2 autobuzProxy = new AutobuzProxy2(autobuz);
        autobuzProxy.adaugaStatie("Victoriei");
        autobuzProxy.adaugaStatie("Romana");
        autobuzProxy.adaugaStatie("Eroilor");
        autobuzProxy.opresteInStatie("Victoriei");


        AutobuzProxy2 autobuzProxy2 = new AutobuzProxy2(autobuz3);
        autobuzProxy2.adaugaStatie("Victoriei");
        autobuzProxy2.adaugaStatie("Romana");
        autobuzProxy2.adaugaStatie("Eroilor");
        autobuzProxy2.opresteInStatie("Victoriei");
    }
}

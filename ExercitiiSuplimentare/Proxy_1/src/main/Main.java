package main;

import clase.Autobuz;
import clase.AutobuzAbstract;
import clase.Proxy;

public class Main {
    public static void main(String[] args) {
        AutobuzAbstract autobuz1 = new Autobuz(12);
        autobuz1.oprireInStatie();

        AutobuzAbstract autobuz3 = new Autobuz(0);
        AutobuzAbstract autobuzdenoapte = new Proxy(autobuz3);
        autobuzdenoapte.oprireInStatie();

        AutobuzAbstract autobuz2 = new Proxy(autobuz1);
        autobuz2.oprireInStatie();
    }
}

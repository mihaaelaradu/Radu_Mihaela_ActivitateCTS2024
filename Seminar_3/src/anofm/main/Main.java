package anofm.main;

import anofm.Manager;
import anofm.ManagerRegistry;
                                             //Singleton nuj care( al treilea
public class Main {
    public static void main(String[] args) {
        ManagerRegistry registru = ManagerRegistry.getInstance();
        registru.inregistreazaManager("CTS", "Popescu", 6673f);
        registru.inregistreazaManager("CTS", "Ionescu", 6673f);
        System.out.println(registru.getManager("CTS"));

    }
}

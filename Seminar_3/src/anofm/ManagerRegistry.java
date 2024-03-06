package anofm;

import java.util.HashMap;
import java.util.Map;

public class ManagerRegistry {
    private Map<String, Manager> manageri;
    private static ManagerRegistry instanta = null;

    private ManagerRegistry(){              //nuuita de constructor privat!!! nu il lasa pe ala generat
        manageri = new HashMap<>();
    }


    public static synchronized ManagerRegistry getInstance(){
        if(instanta == null){
            instanta = new ManagerRegistry();
        }
        return instanta;
    }

    public void inregistreazaManager(String numeFirma, String numeManager, float salariu){
        manageri.putIfAbsent(numeFirma, new Manager(numeFirma, numeManager, salariu));   //daca pui fara ifAbsent o sa vezi ca iti afiseaza Ionescu, nu Popescu
    }

    public Manager getManager(String numeFirma){
        return manageri.get(numeFirma);
    }

}

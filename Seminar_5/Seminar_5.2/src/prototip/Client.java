package prototip;

import java.util.ArrayList;
import java.util.List;

public class Client  implements  AbstractPrototype {

    private List<String> listaAccesorii;
    private int varsta;
    private String nume;

    public Client(int varsta, String nume, List<String> accesorii) {
        if(varsta <14 ){
            throw  new RuntimeException("varsta cv");
        }
        this.varsta = varsta;
        this.nume = nume;
        listaAccesorii = accesorii;
    }

    private Client(){}

    @Override
    public  AbstractPrototype clone(){
        Client newClient = new Client();
        newClient.nume = this.nume;
        newClient.varsta = this.varsta;
        newClient.listaAccesorii = new ArrayList<>();
        this.listaAccesorii.forEach(accesoriu -> {
            newClient.listaAccesorii.add(accesoriu);
        });
        return  null;
    }

    @Override
    public String toString() {
        return "Client{" +
                "listaAccesorii=" + listaAccesorii +
                ", varsta=" + varsta +
                ", nume='" + nume + '\'' +
                '}';
    }

    public List<String> getListaAccesorii() {
        return listaAccesorii;
    }

    public void setListaAccesorii(List<String> listaAccesorii) {
        this.listaAccesorii = listaAccesorii;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        if(varsta<14 ){
            throw new RuntimeException("err");
        }
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}



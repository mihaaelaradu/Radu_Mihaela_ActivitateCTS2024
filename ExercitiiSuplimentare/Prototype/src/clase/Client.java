package clase;

import java.util.ArrayList;
import java.util.List;

public class Client implements AbstractPrototype{
    private String nume;
    private int varsta;
    private List<String> listaAccesorii;

    public Client(String nume, int varsta, List<String> listaAccesorii) {
        this.nume = nume;
        if(varsta < 18)
            throw new IllegalArgumentException("Minor");
        this.varsta = varsta;
        this.listaAccesorii = listaAccesorii;
    }

    public Client() {
    }

    @Override
    public AbstractPrototype clone() {
        Client client = new Client();
        client.nume = this.nume;
        client.varsta = this.varsta;
        client.listaAccesorii = new ArrayList<>();
        client.listaAccesorii.addAll(this.listaAccesorii);
        return client;
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        if(varsta < 18)
            throw new IllegalArgumentException("Minor");
        this.varsta = varsta;
    }

    public List<String> getListaAccesorii() {
        return listaAccesorii;
    }

    public void setListaAccesorii(List<String> listaAccesorii) {
        this.listaAccesorii = listaAccesorii;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", listaAccesorii=" + listaAccesorii +
                '}';
    }
}

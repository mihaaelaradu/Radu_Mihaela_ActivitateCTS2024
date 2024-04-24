package clase;

import observer.Observer;

import java.util.List;

public abstract class Subiect {
    List<Observer> listaObservatori;

    public void adaugaAbonat(Observer observatorNou){
        listaObservatori.add(observatorNou);
    }

    public void stergeAbonat(Observer observerDeSters){
        listaObservatori.remove(observerDeSters);
    }

    public void notificaObservator(String mesaj){
        for(Observer observer : listaObservatori){
            observer.primesteNotificare(mesaj);
        }
    }

    public abstract void notificaMeciFotbal();
    public abstract void notificaMeciVoley();
    public abstract void notificaMeciHandball();
}

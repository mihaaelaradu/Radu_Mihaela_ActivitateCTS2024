package companie;

public class Manager {
    private String nume;
    private double salariu;
    private int nrAbonati;
    private static Manager instanta = null; //= new Manager("John", 9552.55, 40);    //am creat instanta noastra unica//null pt lazy si valori pt igger

    private Manager(String nume, double salariu, int nrAbonati) {    //obligatoriu privat pt Singleton ca s arespecte diagrama/
        this.nume = nume;                                               // ptc noi avem nevoie sa avem o singura intanta
        this.salariu = salariu;
        this.nrAbonati = nrAbonati;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public int getNrAbonati() {
        return nrAbonati;
    }

    public void setNrAbonati(int nrAbonati) {
        this.nrAbonati = nrAbonati;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                ", nrAbonati=" + nrAbonati +
                '}';
    }

//    public static Manager getInstance(){            //igger singleton
//        return instanta;
//    }

    public synchronized static Manager getInstance(String name, double salariu, int nrSub){            //LAZY INITIALIZATION SINGLETON
        if (instanta == null){                                                                          //syncr pt safe thread sync
            instanta =  new Manager(name, salariu, nrSub);
        }
        return instanta;
    }

    public static Manager getInstance(){                             //nuj dc l am facut
        return getInstance("nume", 444.5, 60);
    }
}


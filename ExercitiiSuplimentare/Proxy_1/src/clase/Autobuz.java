package clase;

public class Autobuz implements AutobuzAbstract{
    private int nrCalatori;

    public Autobuz(int nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

    @Override
    public void oprireInStatie() {
        System.out.println("Autobuzul opreste in fiecare sttaie.");
    }

    @Override
    public int getNrCalatori() {
        return nrCalatori;
    }
}

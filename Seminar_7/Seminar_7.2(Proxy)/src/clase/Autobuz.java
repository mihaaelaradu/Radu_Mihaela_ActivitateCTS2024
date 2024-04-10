package clase;

public class Autobuz implements AutobuzAbstract{
    private int nrLocuri;
    private int nrAutobuz;
    private String numeSofer;

    public Autobuz(int nrLocuri, int nrAutobuz, String numeSofer) {
        this.nrLocuri = nrLocuri;
        this.nrAutobuz = nrAutobuz;
        this.numeSofer = numeSofer;
    }

    @Override
    public void opresteInStatie(String statie) {
        System.out.println("Autobuzul " + nrAutobuz + "condus de " + numeSofer + "a oprit in statia " + statie);
    }

    @Override
    public int getNrAutobuz() {
        return nrAutobuz;
    }

    @Override
    public int getNrCalatori() {
        return nrLocuri;
    }

}

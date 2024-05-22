package soft.nou;

public abstract class SoftMetrou {
    private String numeclient;

    public SoftMetrou(String numeclient) {
        this.numeclient = numeclient;
    }

    public abstract boolean estePermisAccesul();

    public String getNumeclient() {
        return numeclient;
    }
}

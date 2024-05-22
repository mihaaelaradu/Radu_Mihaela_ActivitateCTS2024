package soft.nou;

public class BiletMetro extends SoftMetrou{
    private int nrCalatorii;

    public BiletMetro(String numeclient, int nrCalatorii) {
        super(numeclient);
        this.nrCalatorii = nrCalatorii;
    }


    @Override
    public boolean estePermisAccesul() {
        if(nrCalatorii>0){
            this.nrCalatorii -= 1;
            return true;
        } else {
            return false;
        }
    }
}

package soft.nou;

import java.util.GregorianCalendar;

public class AbonamentMetro extends SoftMetrou{
    private GregorianCalendar dataExpirare;

    public AbonamentMetro(String numeclient, GregorianCalendar dataExpirare) {
        super(numeclient);
        this.dataExpirare = dataExpirare;
    }

    @Override
    public boolean estePermisAccesul() {
        return ( dataExpirare.before(new GregorianCalendar()));
    }
}

package soft.vechi;

import java.util.GregorianCalendar;

public class AbonamentCardSTB extends SoftSTB{
    private GregorianCalendar dataExpirareAbonament;

    public AbonamentCardSTB(String numeClient, GregorianCalendar dataExpirareAbonament) {
        super(numeClient);
        this.dataExpirareAbonament = dataExpirareAbonament;
    }


    @Override
    public void validareCalatorie() {
        if(dataExpirareAbonament.before(new GregorianCalendar())){
            System.out.println("Calatorie placuta! ");
        } else {
            System.out.println("Abonamentul a expirat! ");
        }
    }
}

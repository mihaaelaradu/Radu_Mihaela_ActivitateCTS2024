package clase;

public class PachetInchiriereMasina extends InchiriereMasina implements PachetTuristic{
    public PachetInchiriereMasina(Masina masina) {
        super(masina);
    }

    @Override
    public void descriere() {
        System.out.println(super.toString());
    }

    @Override
    public void rezervarePachet() {
        super.inchiriazaMasina();
    }
}

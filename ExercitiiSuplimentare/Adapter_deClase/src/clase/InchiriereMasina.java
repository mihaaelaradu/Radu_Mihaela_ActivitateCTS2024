package clase;

public class InchiriereMasina {
    Masina masina;

    public InchiriereMasina(Masina masina) {
        this.masina = masina;
    }

    public void inchiriazaMasina(){
        System.out.println("A fost inchiriata masina " + masina.toString());

    }

    @Override
    public String toString() {
        return "InchiriereMasina{" +
                "masina=" + masina +
                '}';
    }
}

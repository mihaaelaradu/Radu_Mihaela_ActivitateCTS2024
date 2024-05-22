package soft.nou;

public class MasinaInchiriata {
    private Masina masina;

    public MasinaInchiriata(Masina masina) {
        this.masina = masina;
    }

    public void inchiriazaMasina(){
        System.out.println("A fost inchiriata masina " + this.masina.toString());
    }

    @Override
    public String toString() {
        return "MasinaInchiriata[" +
                "masina=" + masina +
                ']';
    }
}

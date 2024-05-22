package clase;

public class Medicament implements ComponentaAbstracta{
    private String nume;
    private float pret;

    public Medicament(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public void adaugaCategorie(ComponentaAbstracta ca) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeCategorie(ComponentaAbstracta ca) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ComponentaAbstracta getCategorie(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void descriere() {
        System.out.println("Medicaentul " + nume + " are pretul " + pret +".");
    }
}

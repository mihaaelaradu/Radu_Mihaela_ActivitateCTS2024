package clase;

public interface ComponentaAbstracta {
    void adaugaCategorie(ComponentaAbstracta ca);
    void stergeCategorie(ComponentaAbstracta ca);
    ComponentaAbstracta getCategorie(int index);
    void descriere();
}

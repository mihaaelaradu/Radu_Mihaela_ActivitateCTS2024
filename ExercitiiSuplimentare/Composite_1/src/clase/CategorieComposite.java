package clase;

import java.util.ArrayList;
import java.util.List;

public class CategorieComposite implements ComponentaAbstracta{
    private List<ComponentaAbstracta> listaMedicamente;
    private String denumire;

    public CategorieComposite(String denumire) {
        this.listaMedicamente = new ArrayList<>();
        this.denumire = denumire;
    }

    @Override
    public void adaugaCategorie(ComponentaAbstracta ca) {
        listaMedicamente.add(ca);
    }

    @Override
    public void stergeCategorie(ComponentaAbstracta ca) {
        listaMedicamente.remove(ca);
    }

    @Override
    public ComponentaAbstracta getCategorie(int index) {
        return listaMedicamente.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("     Categoria "+ denumire + " contine urmatoarele subcategorii: ");
        for(ComponentaAbstracta ca : listaMedicamente){
            ca.descriere();
        }
    }
}

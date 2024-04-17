package clase;

import java.util.ArrayList;
import java.util.List;

public class Departament extends StructuraAbstracta{
    private List<StructuraAbstracta> structuri;
    private String directorDepartament;

    public Departament(String nume, String directorDepartament) {
        super(nume);
        this.structuri = new ArrayList<>();
        this.directorDepartament = directorDepartament;
    }


    @Override
    public void adaugaStructura(StructuraAbstracta structuraAbstracta) {
        this.structuri.add(structuraAbstracta);
    }

    @Override
    public void stergeStructura(StructuraAbstracta structuraAbstracta) {
        this.structuri.remove(structuraAbstracta);
    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        if( index >= 0 && index < this.structuri.size()){
            return this.structuri.get(index);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void afiseazaDescriere(String indentare) {
        System.out.println(indentare + "Departamentul " + super.getNume() + " are ca sef pe " + this.directorDepartament + "si are urmatoarea componenta:");
        for(StructuraAbstracta sa : this.structuri){
            sa.afiseazaDescriere(indentare + "   ");
        }
    }
}

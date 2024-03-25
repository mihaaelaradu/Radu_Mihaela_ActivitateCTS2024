package clase;

public class Gripa extends Medicament{
    private int cantitate;


    public Gripa(String denumire, float pret, int cantitate) {
        super(denumire, pret);
        this.cantitate = cantitate;
    }

        @Override
        public void afisareMedicament() {
            System.out.printf("%s cost %f lei si este bun pentru gripa\n", super.getDenumire(),super.getPret());
        }
}

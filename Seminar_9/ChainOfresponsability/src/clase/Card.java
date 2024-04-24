package clase;

public class Card extends ModPlata{
    private int sold;

    public Card(int sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(int suma, String nume) {
        if (sold >= suma) {
            System.out.println("Plata se realizeaza cu cardul.");
            sold -= suma;
        } else {
            super.succesor.plateste(suma, nume);
        }
    }
}

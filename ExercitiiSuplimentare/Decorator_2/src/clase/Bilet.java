package clase;

public class Bilet implements BiletAbstract{

    private int codBilet;

    public Bilet(int codBilet) {
        this.codBilet = codBilet;
    }

    @Override
    public void printeazaBilet() {
        System.out.println("Biletul " + codBilet + " a fost printat.");
    }
}

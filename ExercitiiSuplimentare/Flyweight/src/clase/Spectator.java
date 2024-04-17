package clase;

public class Spectator implements Flyweight{
    private int latime;
    private int inaltime;

    public Spectator(int latime, int inaltime) {
        this.latime = latime;
        this.inaltime = inaltime;
    }

    @Override
    public void deseneaza(CaracteristiciOptionale caracteristiciOptionale) {
        System.out.println(this.toString() +
                                        caracteristiciOptionale.toString()
        );
    }

    public int getLatime() {
        return latime;
    }

    public int getInaltime() {
        return inaltime;
    }

    @Override
    public String toString() {
        return "Spectator{" +
                "latime=" + latime +
                ", inaltime=" + inaltime +
                '}';
    }
}

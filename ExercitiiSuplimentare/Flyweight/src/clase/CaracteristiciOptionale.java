package clase;

public class CaracteristiciOptionale {
    private int pozx;
    private int pozy;
    private String culoare;

    public CaracteristiciOptionale(int pozx, int pozy, String culoare) {
        this.pozx = pozx;
        this.pozy = pozy;
        this.culoare = culoare;
    }

    public int getPozx() {
        return pozx;
    }

    public int getPozy() {
        return pozy;
    }

    public String getCuloare() {
        return culoare;
    }

    @Override
    public String toString() {
        return "CaracteristiciOptionale{" +
                "pozx=" + pozx +
                ", pozy=" + pozy +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}

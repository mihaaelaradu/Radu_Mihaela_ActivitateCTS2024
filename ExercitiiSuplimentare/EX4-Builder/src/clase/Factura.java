package clase;

public class Factura {
    private int nrPungi;
    private boolean plataCuCard;
    private boolean cardFidelitate;
    private float cotaTVA;

    public Factura(int nrPungi, boolean plataCuCard, boolean cardFidelitate, float cotaTVA) {
        this.nrPungi = nrPungi;
        this.plataCuCard = plataCuCard;
        this.cardFidelitate = cardFidelitate;
        this.cotaTVA = cotaTVA;
    }

    public Factura() {
        this.nrPungi = 0;
        this.plataCuCard = false;
        this.cardFidelitate = false;
        this.cotaTVA = 0.0f;
    }

    public int getNrPungi() {
        return nrPungi;
    }

    public void setNrPungi(int nrPungi) {
        this.nrPungi = nrPungi;
    }

    public boolean isPlataCuCard() {
        return plataCuCard;
    }

    public void setPlataCuCard(boolean plataCuCard) {
        this.plataCuCard = plataCuCard;
    }

    public boolean isCardFidelitate() {
        return cardFidelitate;
    }

    public void setCardFidelitate(boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
    }

    public float getCotaTVA() {
        return cotaTVA;
    }

    public void setCotaTVA(float cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "nrPungi=" + nrPungi +
                ", plataCuCard=" + plataCuCard +
                ", cardFidelitate=" + cardFidelitate +
                ", cotaTVA=" + cotaTVA +
                '}';
    }
}

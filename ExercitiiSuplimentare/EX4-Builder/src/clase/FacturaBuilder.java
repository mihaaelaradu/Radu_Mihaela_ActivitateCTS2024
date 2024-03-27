package clase;

public class FacturaBuilder implements AbstractBuilder{
    private int nrPungi;
    private boolean plataCuCard;
    private boolean cardFidelitate;
    private float cotaTVA;

    public FacturaBuilder() {
        this.nrPungi = 0;
        this.plataCuCard = false;
        this.cardFidelitate = false;
        this.cotaTVA = 0.0f;
    }

    @Override
    public Factura adaugaFactura() {
        return new Factura();
    }

    public FacturaBuilder setNrPungi(int nrPungi) {
        this.nrPungi = nrPungi;
        return this;
    }

    public FacturaBuilder setPlataCuCard(boolean plataCuCard) {
        this.plataCuCard = plataCuCard;
        return this;
    }

    public FacturaBuilder setCardFidelitate(boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
        return this;
    }

    public FacturaBuilder setCotaTVA(float cotaTVA) {
        this.cotaTVA = cotaTVA;
        return this;
    }
}

package clase;

public class PachetTransportBuilder implements Builder {
    private boolean hasWifi;
    private boolean hasAnimale;
    private boolean isFumator;
    private boolean hasAC;
    private boolean hasTV;

    public PachetTransportBuilder() {
        this.hasWifi = false;
        this.hasAnimale = false;
        this.isFumator = false;
        this.hasAC = false;
        this.hasTV = false;
    }

    @Override
    public PachetTransport build() {
        return new PachetTransport(hasWifi,hasAnimale,isFumator, hasAC, hasTV);
    }


    public PachetTransportBuilder setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
        return this;
    }

    public PachetTransportBuilder setHasAnimale(boolean hasAnimale) {
        this.hasAnimale = hasAnimale;
        return this;
    }

    public PachetTransportBuilder setFumator(boolean fumator) {
        isFumator = fumator;
        return this;
    }

    public PachetTransportBuilder setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
        return this;
    }

    public PachetTransportBuilder setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
        return this;
    }
}

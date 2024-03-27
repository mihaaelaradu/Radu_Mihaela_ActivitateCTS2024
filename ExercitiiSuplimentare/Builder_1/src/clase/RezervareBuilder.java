package clase;

public class RezervareBuilder implements AbstractBuilder{
    private boolean hasMancare;
    private boolean hasMuzica;
    private boolean hasScaunErgonomic;
    private String genMuzical;

    public RezervareBuilder() {
        this.hasMancare = false;
        this.hasMuzica = false;
        this.hasScaunErgonomic = false;
        this.genMuzical = "";
    }

    @Override
    public Rezervare build() {
        return new Rezervare(hasMancare,hasMuzica,hasScaunErgonomic,genMuzical);
    }


    public RezervareBuilder setHasMancare(boolean hasMancare) {
        this.hasMancare = hasMancare;
        return this;
    }

    public RezervareBuilder setHasMuzica(boolean hasMuzica) {
        this.hasMuzica = hasMuzica;
        return this;
    }

    public RezervareBuilder setHasScaunErgonomic(boolean hasScaunErgonomic) {
        this.hasScaunErgonomic = hasScaunErgonomic;
        return this;
    }

    public RezervareBuilder setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
        return this;
    }
}

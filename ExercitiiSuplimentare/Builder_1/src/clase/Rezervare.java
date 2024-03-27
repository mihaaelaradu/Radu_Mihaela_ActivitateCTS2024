package clase;

public class Rezervare {
    private boolean hasMancare;
    private boolean hasMuzica;
    private boolean hasScaunErgonomic;
    private String genMuzical;

    public Rezervare(boolean hasMancare, boolean hasMuzica, boolean hasScaunErgonomic, String genMuzical) {
        this.hasMancare = hasMancare;
        this.hasMuzica = hasMuzica;
        this.hasScaunErgonomic = hasScaunErgonomic;
        this.genMuzical = genMuzical;
    }

    public Rezervare() {
        this.hasMancare = false;
        this.hasMuzica = false;
        this.hasScaunErgonomic = false;
        this.genMuzical = " ";
    }

    public boolean isHasMancare() {
        return hasMancare;
    }

    public void setHasMancare(boolean hasMancare) {
        this.hasMancare = hasMancare;
    }

    public boolean isHasMuzica() {
        return hasMuzica;
    }

    public void setHasMuzica(boolean hasMuzica) {
        this.hasMuzica = hasMuzica;
    }

    public boolean isHasScaunErgonomic() {
        return hasScaunErgonomic;
    }

    public void setHasScaunErgonomic(boolean hasScaunErgonomic) {
        this.hasScaunErgonomic = hasScaunErgonomic;
    }

    public String getGenMuzical() {
        return genMuzical;
    }

    public void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "hasMancare=" + hasMancare +
                ", hasMuzica=" + hasMuzica +
                ", hasScaunErgonomic=" + hasScaunErgonomic +
                ", genMuzical='" + genMuzical + '\'' +
                '}';
    }
}

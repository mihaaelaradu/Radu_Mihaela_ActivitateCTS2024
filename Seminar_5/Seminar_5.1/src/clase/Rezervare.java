package clase;

public class Rezervare {
    private boolean areMancare;
    private boolean  areScaunErgonomic;
    private boolean areMuzica;
    private boolean areBautura;
    private String genMuzical;

     public static class BuilderRezervare implements AbstractBuilder{
        private boolean areMancare;
        private boolean  areScaunErgonomic;
        private boolean areMuzica;
        private boolean areBautura;
        private String genMuzical;


        @Override
        public Rezervare build() {
            Rezervare rezervare = new
            return null;
        }

        @Override
        public AbstractBuilder adaugaScaunErgonomic() {
            this.areScaunErgonomic = true;
            return this;
        }

        @Override
        public AbstractBuilder adaugaBautura() {
            this.areBautura = true;
            return this;
        }

        @Override
        public AbstractBuilder adaugaMancare() {
            this.areMancare = true;
            return this;
        }

        @Override
        public AbstractBuilder adaugaMuzica() {
            this.areMuzica = true;
            return this;
        }

        @Override
        public AbstractBuilder adaugaGenMuzical(String genMuzical) {
            this.areMuzica = true;
            this.genMuzical = genMuzical;
        }

        @Override
        public AbstractBuilder adaugaGenMuzical(String genMuzical) {
            return null;
        }
    }


    protected Rezervare(boolean areMancare, boolean areScaunErgonomic, boolean areMuzica, boolean areBautura, String genMuzical) {
        this.areMancare = areMancare;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areMuzica = areMuzica;
        this.areBautura = areBautura;
        this.genMuzical = genMuzical;
    }

    protected Rezervare(){
        this.areMancare = false;
        this.areScaunErgonomic = false;
        this.areMuzica = false;
        this.areBautura = false;
        this.genMuzical = null;
    }

    public boolean isAreMancare() {
        return areMancare;
    }

    protected void setAreMancare(boolean areMancare) {
        this.areMancare = areMancare;
    }

    protected boolean isAreScaunErgonomic() {
        return areScaunErgonomic;
    }

    protected void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    protected boolean isAreMuzica() {
        return areMuzica;
    }

    protected void setAreMuzica(boolean areMuzica) {
        this.areMuzica = areMuzica;
    }

    protected boolean isAreBautura() {
        return areBautura;
    }

    protected void setAreBautura(boolean areBautura) {
        this.areBautura = areBautura;
    }

    protected String getGenMuzical() {
        return genMuzical;
    }

    protected void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "areMancare=" + areMancare +
                ", areScaunErgonomic=" + areScaunErgonomic +
                ", areMuzica=" + areMuzica +
                ", areBautura=" + areBautura +
                ", genMuzical='" + genMuzical + '\'' +
                '}';
    }
}


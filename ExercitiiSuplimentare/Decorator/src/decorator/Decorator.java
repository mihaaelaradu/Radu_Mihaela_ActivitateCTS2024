package decorator;

import clase.DiagnosticAbstract;

public abstract class Decorator implements DiagnosticAbstract {
    private DiagnosticAbstract diagnostic;

    public Decorator(DiagnosticAbstract diagnostic) {
        this.diagnostic = diagnostic;
    }

    public abstract void afisareOnline();


    @Override
    public void printeazaDiagnostic() {
        System.out.println("Rezultatul este disponibil si pe platforma");
    }

    @Override
    public String getNume() {
        return diagnostic.getNume();
    }

    @Override
    public String getDescriereSimptome() {
        return diagnostic.getDescriereSimptome();
    }

    @Override
    public boolean isNecesitaSpitalizare() {
        return diagnostic.isNecesitaSpitalizare();
    }
}

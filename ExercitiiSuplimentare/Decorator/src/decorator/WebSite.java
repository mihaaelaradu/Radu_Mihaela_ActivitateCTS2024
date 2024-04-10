package decorator;

import clase.DiagnosticAbstract;

public class WebSite extends Decorator{
    public WebSite(DiagnosticAbstract diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afisareOnline() {
        System.out.println("In cadrul site-ului ati primid urmatorul diagnostic: " + "\n" + super.getNume() + " " + super.getDescriereSimptome() + " " + ((super.isNecesitaSpitalizare())? " " : " nu" )+ " are nevoie de spitalizare");
    }
}

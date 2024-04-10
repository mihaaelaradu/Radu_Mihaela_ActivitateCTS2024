package main;

import clase.Diagnostic;
import clase.DiagnosticAbstract;
import decorator.Decorator;
import decorator.WebSite;

public class Main {
    public static void main(String[] args) {
        DiagnosticAbstract diagnostic = new Diagnostic("Rcaeala", "tuse", false);
        diagnostic.printeazaDiagnostic();

        Decorator decorator = new WebSite(diagnostic);
        decorator.afisareOnline();
    }
}

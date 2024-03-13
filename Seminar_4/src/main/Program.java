package main;

import clase.Durere;
import clase.Medicament;
import clase.MedicamentFcatory;
import clase.TipMediament;

public class Program {
    public static void main(String[] args){
        try {
            Medicament durere = MedicamentFcatory.creareMedicament(TipMediament.DURERE, "nurofem", 12, 10);

            durere.afisareDetalii();
            Medicament body = MedicamentFcatory.creareMedicament(TipMediament.BODY,"cevaa", 23, 2);
            durere.afisareDetalii();
            body.afisareDetalii();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

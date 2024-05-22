package soft.adapter;

import soft.nou.MasinaInchiriata;
import soft.vechi.PachetTuristic;

public class PachetMasinaInchiriata implements PachetTuristic {
    MasinaInchiriata masinaInchiriata;

    public PachetMasinaInchiriata(MasinaInchiriata masinaInchiriata) {
        this.masinaInchiriata = masinaInchiriata;
    }

    @Override
    public void descriere() {
        System.out.printf(masinaInchiriata.toString());
    }

    @Override
    public void rezervaPachet() {
        masinaInchiriata.inchiriazaMasina();
    }
}

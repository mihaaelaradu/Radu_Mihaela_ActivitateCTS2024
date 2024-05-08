package clase;

public abstract class PachetTuristic {
    private int codPachet;

    public PachetTuristic(int codPachet) {
        this.codPachet = codPachet;
    }

    public abstract void cautareCazare(int codPachet);
    public abstract void cautareTransport(int codPachet);
    public abstract void rezervarePachet(int codPachet);
    public abstract void platirePachet(int codPachet);

    public final void vindePachet(){
        cautareCazare(codPachet);
        cautareTransport(codPachet);
        rezervarePachet(codPachet);
        platirePachet(codPachet);
    }
}

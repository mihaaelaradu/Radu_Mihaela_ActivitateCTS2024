package clase;

public class PachetCazare implements PachetTuristic{
    @Override
    public void descriere() {
        System.out.println("Acest pachet contine doar cazare.");
    }

    @Override
    public void rezervarePachet() {
        System.out.println("A fost rezervat pachetul cu cazare.");
    }
}

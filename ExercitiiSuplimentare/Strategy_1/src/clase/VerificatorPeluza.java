package clase;

public class VerificatorPeluza implements IStrategy{
    @Override
    public void verifica(String nume) {
        System.out.println("Se verifica corporal " + nume);
    }
}

package clase;

public class VerificatorTribuna implements IStrategy{
    @Override
    public void verifica(String nume) {
        System.out.println("Este verificat bagajul lui "+ nume);
    }
}

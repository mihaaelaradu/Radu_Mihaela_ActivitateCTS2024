package clase;

public class VerificatorVIP implements IStrategy{
    @Override
    public void verifica(String nume) {
        System.out.println("Este verificat biletul lui " + nume);
    }
}

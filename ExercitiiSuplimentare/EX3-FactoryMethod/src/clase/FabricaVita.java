package clase;

public class FabricaVita implements AbstractFactory{
    @Override
    public InterfatSupa getSupa() {
        return new Vita();
    }
}

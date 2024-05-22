package soft.vechi;

public abstract class SoftSTB {
    private String numeClient;

    public SoftSTB(String numeClient) {
        this.numeClient = numeClient;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public abstract void validareCalatorie();
}

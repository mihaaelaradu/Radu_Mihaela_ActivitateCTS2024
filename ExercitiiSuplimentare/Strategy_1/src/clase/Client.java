package clase;

public class Client {
    private IStrategy strategie;

    public Client(IStrategy strategie) {
        this.strategie = strategie;
    }

    public Client() {
        this.strategie = new VerificatorPeluza();
    }

    public void setStrategie(IStrategy strategie) {
        this.strategie = strategie;
    }

    public void verificaSuporter(String numeSuporter){
        this.strategie.verifica(numeSuporter);
    }
}

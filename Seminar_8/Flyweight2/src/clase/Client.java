package clase;

public class Client implements Flyweight{
    private String nume;
    private String adersa;
    private String nrTelefon;

    public Client(String nume, String adersa, String nrTelefon) {
        this.nume = nume;
        this.adersa = adersa;
        this.nrTelefon = nrTelefon;
    }

    @Override
    public void afiseazaInformatii(Cont cont) {
        System.out.println("Numele clientului este "+ nume + " , are adresa "+ adersa + " si contul " + cont.toString());
    }
}

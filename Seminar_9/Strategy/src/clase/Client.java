package clase;

public class Client {
    private String nume;
    private ModPlata modPlata;

    public Client(String nume) {
        this.nume = nume;
        this.modPlata = new Cash();
    }

//    public Client() {
//        this.modPlata = new Cash();
//    }


    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void realizarePlata(int suma){
        this.modPlata.plateste(suma, this.nume);
    }


}

package clase;

public class Client implements Flyweight{
    public String nume;
    public String numarAsigurare;

    public Client(String nume, String numarAsigurare) {
        this.nume = nume;
        this.numarAsigurare = numarAsigurare;
    }

    @Override
    public void achizitioneazaReteta(Reteta reteta) {
        System.out.println("Clientul "+ this.nume+ "cu numarul de asigurare "+ numarAsigurare+ " achizitioneaza "+ reteta.toString());
    }


}

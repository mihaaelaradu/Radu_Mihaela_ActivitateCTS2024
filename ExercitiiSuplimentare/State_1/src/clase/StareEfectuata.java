package clase;

public class StareEfectuata implements Stare{
    @Override
    public void doAction(Rezervare rezervare) {
        System.out.println("Rezervarea cu id-ul " + rezervare.getId() + " este trecuta in starea efectuata.");
        rezervare.setState(this);
    }
}

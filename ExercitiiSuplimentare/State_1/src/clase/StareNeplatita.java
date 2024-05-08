package clase;

public class StareNeplatita implements Stare{
    @Override
    public void doAction(Rezervare rezervare) {
        System.out.println("Rezervarea cu id-ul " + rezervare.getId() + " este trecuta cin starea neplatita.");
        rezervare.setState(this);
    }
}

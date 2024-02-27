import model.acvatice.Caras;
import model.animale.Lion;
import model.animale.Zebra;
import model.zoo.Zoo;
import model.zoo.ZooKeeper;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo Bucuresti", new ZooKeeper("Gigel"));
        zoo.adaugaVietate(new Lion(5, "Symba", 4), "carne");
        zoo.adaugaVietate(new Zebra(7, "Lizzy", 4), "fan");
        zoo.adaugaVietate(new Lion(6, "Scar", 4), "carne");
        // zoo.adaugaVietate(new Caras(2, "Caras"), "mamaliga");
        zoo.feedAllAnimals();

        tipuriMancare tipCarnivor = tipuriMancare.CARNIVOR;
    }

    public enum tipuriMancare
    {
        CARNIVOR,
        IERBIVOR,
        OMNIVOR
    }
}
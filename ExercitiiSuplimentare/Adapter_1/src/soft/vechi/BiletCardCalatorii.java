package soft.vechi;

public class BiletCardCalatorii extends SoftSTB {
    private double soldCard;
    private static double pretCalatorie = 3.2;

    public BiletCardCalatorii(String numeClient, double soldCard) {
        super(numeClient);
        this.soldCard = soldCard;
    }

    @Override
    public void validareCalatorie() {
        if(soldCard > pretCalatorie){
            System.out.println("Calatorie placuta! ");
            soldCard -= pretCalatorie;
        } else {
            System.out.println("Fonduri insuficiente! ");
        }
    }
}

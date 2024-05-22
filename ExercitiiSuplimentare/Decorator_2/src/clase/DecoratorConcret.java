package clase;

public class DecoratorConcret extends DecoratorAbstrcat{
    public DecoratorConcret(BiletAbstract biletAbstract) {
        super(biletAbstract);
    }

    @Override
    public void printareLMA() {
        super.biletAbstract.printeazaBilet();
        System.out.println("EHEEEEE!");
    }


}

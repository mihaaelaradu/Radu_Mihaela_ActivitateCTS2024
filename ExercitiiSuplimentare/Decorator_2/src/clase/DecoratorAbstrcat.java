package clase;

public abstract class DecoratorAbstrcat implements BiletAbstract{
    protected BiletAbstract biletAbstract;

    public DecoratorAbstrcat(BiletAbstract biletAbstract) {
        this.biletAbstract = biletAbstract;
    }

    @Override
    public void printeazaBilet() {
        biletAbstract.printeazaBilet();
        System.out.println("LMA!");
    }

    public abstract void printareLMA();

}

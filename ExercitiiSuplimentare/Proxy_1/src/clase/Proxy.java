package clase;

public class Proxy implements AutobuzAbstract{
    AutobuzAbstract autobuzAbstract;

    public Proxy(AutobuzAbstract autobuzAbstract) {
        this.autobuzAbstract = autobuzAbstract;
    }


    @Override
    public void oprireInStatie() {
        if(autobuzAbstract.getNrCalatori()<1){
            System.out.println("Autobuzul nu opreste.");
        }else {
            autobuzAbstract.oprireInStatie();
        }
    }

    @Override
    public int getNrCalatori() {
        return autobuzAbstract.getNrCalatori();
    }
}

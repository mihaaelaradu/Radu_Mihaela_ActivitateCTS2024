package clase;

public class Facade {

    public void puneModLiber(){
        Autobuz autobuz = new Autobuz();
        autobuz.puneModLiber_usaF();
        autobuz.puneModLiber_usaM();
        autobuz.puneModLiber_usaS();
    }

    public void puneModFortat(){
        Autobuz autobuz = new Autobuz();
        autobuz.puneModFortat_usaF();
        autobuz.puneModFortat_usaM();
        autobuz.puneModFortat_usaS();
    }
}

package clase;

public class Fabrica {

    public InterfataPersonalSpital getPersonalSpital(TipPersonalSpital tipPersonalSpital) throws IllegalAccessException {
        switch (tipPersonalSpital){
            case MEDIC:
                return new Medic();
            case ASISTENT:
                return new Asistent();
            case BRANCARDIER:
                return new Brancardier();
            default:
                throw new IllegalAccessException("Nu exista job");
        }
    }
}

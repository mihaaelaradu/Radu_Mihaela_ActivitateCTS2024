package clase;

public class Sesiune {
    private String nume;
    private static Sesiune instanta = null ;

    private Sesiune(String nume) {
        this.nume = nume;
    }

    public static synchronized Sesiune getInstanta(String nume){
        if(instanta == null)
            instanta = new Sesiune(nume);
        return instanta;
    }

    @Override
    public String toString() {
        return "Sesiune{" +
                "nume='" + nume + '\'' +
                '}';
    }
}

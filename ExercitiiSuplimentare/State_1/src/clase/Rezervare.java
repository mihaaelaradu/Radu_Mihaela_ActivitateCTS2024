package clase;

public class Rezervare {
    private Stare state;
    private int id;

    public Rezervare(int id) {
        this.state = null;
        this.id = id;
    }

    public Stare getState() {
        return state;
    }

    public void setState(Stare state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

package clase;

public class Reteta {
    private int nrReteta;
    private int nrmedicamente;
    private State stare;


    public Reteta(int nrReteta, int nrmedicamente) {
        this.nrReteta = nrReteta;
        this.nrmedicamente = nrmedicamente;
        this.stare = new Emisa();
    }

    protected void setStare(State stare) {
        this.stare = stare;
    }

    public void solicitaMedicament(){
        if(this.stare instanceof Emisa){
            System.out.println("Reteta cu nr "+ nrReteta + " au fost solicitate "+ nrmedicamente);
//            this.stare = new Solicitata();
            //alta varianta
            State solicitata = new Solicitata();
            solicitata.schimbaStare(this);
        }
        else {
            System.out.println("Medicamentele nu pot fi solicitate");
        }
    }

    public void cumparaMedicamente(){
        if(this.stare instanceof Solicitata){
            State achizitionata = new Achizitionata();
            achizitionata.schimbaStare(this);
            System.out.printf("Reteta cu nr "+ nrReteta + " a fost achizitionata.");
        } else {
            System.out.printf("Reteta cu nr "+nrReteta+ " NU poate fi achizitionata.");
        }
    }

    public void respingeAchizite(){
        if (this.stare instanceof Solicitata){
            State emisa = new Emisa();
            emisa.schimbaStare(this);
            System.out.printf("Ne pare rau, nu avem medicamene din reteta " + nrReteta);
        } else {
            System.out.printf("Reteta nu poate fi respinsa.");
        }
    }


    @Override
    public String toString() {
        return "Reteta{" +
                "nrReteta=" + nrReteta +
                ", nrmedicamente=" + nrmedicamente +
                ", stare=" + stare +
                '}';
    }
}

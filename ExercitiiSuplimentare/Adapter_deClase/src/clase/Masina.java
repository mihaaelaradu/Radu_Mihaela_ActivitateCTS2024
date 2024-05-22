package clase;

public class Masina {
    private String brand;
    private float pret;


    public Masina(String brand, float pret) {
        this.brand = brand;
        this.pret = pret;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "brand='" + brand + '\'' +
                ", pret=" + pret +
                '}';
    }
}

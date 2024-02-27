package model.animale;

public abstract class Animal implements Vietate {
    private int age;
    private String name;
    private int nrPicioare;

    public Animal(int age, String name, int nrPicioare) {
        this.age = age;
        this.name = name;
        this.nrPicioare = nrPicioare;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNrPicioare() {
        return nrPicioare;
    }

    public void setNrPicioare(int nrPicioare) {
        this.nrPicioare = nrPicioare;
    }
}

package model.animale;

public class Zebra extends Animal{

    public Zebra(int age, String name, int nrPicioare) {
        super(age, name, nrPicioare);
    }
    @Override
    public void eat(String mancare) {
        var sb = new StringBuilder();
        sb.append("Zebra ");
        sb.append(getName());
        sb.append(" mananca ").append(mancare);
        System.out.println(sb);
    }
}
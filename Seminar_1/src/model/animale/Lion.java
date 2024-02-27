package model.animale;

public class Lion extends Animal{
    public Lion(int age, String name, int nrPicioare) {
        super(age, name, nrPicioare);
    }

    @Override
    public void eat(String mancare) {
        var sb = new StringBuilder();
        sb.append("Leul ");
        sb.append(getName());
        sb.append(" mananca ").append(mancare);
        System.out.println(sb);
    }

}
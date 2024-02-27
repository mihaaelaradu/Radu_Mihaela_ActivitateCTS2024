package model.zoo;

import model.animale.Vietate;

public class ZooKeeper {
    private String name;
    public void feedAnimal(Vietate vietate, String mancare)
    {
        vietate.eat(mancare);
    }

    public ZooKeeper(String name) {
        this.name = name;
    }
}

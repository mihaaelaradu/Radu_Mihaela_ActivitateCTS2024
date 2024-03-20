package main;


import prototip.AbstractPrototype;
import prototip.Client;

import java.util.ArrayList;
import java.util.List;

//ex 4 E
public class Main {
    public static void main(String[] args) {
        List<String> accesorii =  new ArrayList<>();
        accesorii.add("aaa");
        accesorii.add("bbb");
        Client client = new Client(10, "ana", accesorii);

        AbstractPrototype client2 = client.clone();

        System.out.println(client);

        ((Client)client2).set
        System.out.println(client2);
    }
}

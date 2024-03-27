package main;

import clase.Manager;

public class Main {
    public static void main(String[] args) {

        Manager manager1 = Manager.getInstanta("Alex",30.4f, 2000.34);
        Manager manager2 = Manager.getInstanta("Andrei", 34f,233);

        System.out.println(manager1.getNume());
        System.out.println(manager2.getNume());
    }
}

package main;
import companie.Manager;                             //SINGLETON IGGLE INITIALIZATION

public class Main {                                      //scrii "main" si generezi mainul!!!!!! FOARTE IMPORTANT SA NU IL UIT
    public static void main(String[] args) {                 //asta e mainul
        Manager manager1 = Manager.getInstance("sss", 45.6 , 4);     //am dat valori pt LAZY
        Manager manager2 = Manager.getInstance();                //PT NORMAL

        System.out.println(manager1);
        System.out.println(manager2);
    }

}

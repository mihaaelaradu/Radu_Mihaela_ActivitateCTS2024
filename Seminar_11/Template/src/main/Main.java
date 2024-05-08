package main;

import clase.AchizitiePeBazaDeReteta;
import clase.AchizitionareMedicamente;
import clase.Reteta;

//ex 14 C
public class Main {
    public static void main(String[] args) {
        Reteta reteta1=new Reteta(1234);
        reteta1.adaugareMedicamente("Paracetamol");
        reteta1.adaugareMedicamente("Mig400");

        AchizitionareMedicamente achizitie1=new AchizitiePeBazaDeReteta(reteta1);
        achizitie1.achitioneazaMedicamente();

        System.out.println();
        Reteta reteta2=new Reteta(1235);
        reteta2.adaugareMedicamente("Paracetamol");
        reteta2.adaugareMedicamente("Ceva");

        AchizitionareMedicamente achizitie2=new AchizitiePeBazaDeReteta(reteta1);
        achizitie2.achitioneazaMedicamente();
    }
}

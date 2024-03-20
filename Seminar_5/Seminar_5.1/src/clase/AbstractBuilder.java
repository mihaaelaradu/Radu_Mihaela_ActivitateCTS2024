package clase;
public interface AbstractBuilder {


    Rezervare build();

    AbstractBuilder adaugaScaunErgonomic();
    AbstractBuilder adaugaBautura();
    AbstractBuilder adaugaMancare();
    AbstractBuilder adaugaMuzica();
    AbstractBuilder adaugaGenMuzical();


    AbstractBuilder adaugaGenMuzical(String genMuzical);
}


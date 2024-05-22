package clase;

import java.util.ArrayList;
import java.util.List;

public class Menajera {
    private List<Boolean> listaCamereCurate;


    public Menajera() {
        this.listaCamereCurate = new ArrayList<Boolean>();

        for (int i = 0; i<6; i++)
            listaCamereCurate.add(true);
        for(int i=6; i<15; i++)
            listaCamereCurate.add(false);
    }

    public boolean esteCameraCurata(int index){
        return listaCamereCurate.get(index);
    }

    public boolean areProsoapeNoi (int indexCamera){
        return listaCamereCurate.get(indexCamera);
    }
}

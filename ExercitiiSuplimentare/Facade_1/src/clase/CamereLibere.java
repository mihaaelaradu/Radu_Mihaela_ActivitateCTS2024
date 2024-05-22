package clase;

import java.util.ArrayList;
import java.util.List;

public class CamereLibere {
    private List<Integer> listaCamereLibere;


    public CamereLibere() {
        this.listaCamereLibere = new ArrayList<Integer>();

        for (int i=0; i<10; i++)
            listaCamereLibere.add(i+1);
    }

    public boolean verificareCameraLibera( int indexCamera){
        return listaCamereLibere.contains(indexCamera);
    }

}

package clase;

public class Facade {

    public static boolean verificareCamera(int indexCamera){
        CamereLibere libere = new CamereLibere();
        if(libere.verificareCameraLibera(indexCamera)) {
            Menajera menajera = new Menajera();
            if(menajera.esteCameraCurata(indexCamera) && menajera.areProsoapeNoi(indexCamera)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static String verificareDisponibilitateCamera(int indexCamera) {
        CamereLibere libere = new CamereLibere();
        if(libere.verificareCameraLibera(indexCamera)) {
            Menajera menajera = new Menajera();
            if(menajera.areProsoapeNoi(indexCamera) && menajera.esteCameraCurata(indexCamera)){
                return "Camera este gata.";
            } else {
                return "Asteptati pana se face curat.";
            }
        } else {
            return "Asteptati pana se elibereaza.";
        }
    }


}

package teszt;

import modell.Auto;

public class JarmuvekTeszt {

    public static void main(String[] args) {
        new JarmuvekTeszt();
        
    }

    public JarmuvekTeszt() {
        //mintaTeszt();
        //haladTeszt();
        haladBeinditTeszt();
        haladDefektTeszt();
        haladNincsUzemanyagTeszt();
        
    }
    
    private void haladBeinditTeszt() {
        Auto auto = new Auto();
        auto.beindit();
        boolean kapott = auto.halad();
        boolean vart = true;
        assert kapott == vart: "nem tud haladni beinditás után";
    }
    
    private void haladDefektTeszt() {
        Auto auto = new Auto();
        auto.beindit();
        auto.setDefekt(true);
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart: "tud haladni defektel";
    }
    
    private void haladNincsUzemanyagTeszt() {
        Auto auto = new Auto();
        auto.beindit();
        auto.setUzemanyag(false);
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart: "tud haladni üzemanyag nélkül";
    }
    
    private void haladTeszt() {
        Auto auto = new Auto();
        boolean kapott = auto.halad();
        boolean vart = true;
        assert kapott == vart: "nem tud haladni";
    }
    
    public void mintaTeszt() {
        int kapott = 7;
        int vart = 4;
        assert kapott == vart: "nem egyeznek";
    }

}

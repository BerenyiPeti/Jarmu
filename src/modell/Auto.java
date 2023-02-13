package modell;

public class Auto extends Jarmu {

    private boolean defekt;

    public Auto(boolean beinditva, boolean uzemanyag, boolean megerkezett) {
        super(beinditva, uzemanyag, megerkezett);
        this.defekt = false;
    }

    public Auto() {

    }

    public void kereketCserel() {
        defekt = false;
    }

    public void setDefekt(boolean defekt) {
        this.defekt = defekt;
    }
    
    

    @Override
    public boolean halad() {
        //return super.halad();
        if (isBeinditva() && !defekt && isUzemanyag()) {
            return true;
        }
        
        return false;
    }

}

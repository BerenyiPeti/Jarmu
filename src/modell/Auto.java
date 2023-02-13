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

    @Override
    public boolean halad() {
        if (!defekt) {
            return true;
        }
        return false;
    }

}

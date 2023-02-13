package modell;

public abstract class Jarmu {

    private boolean beinditva, uzemanyag, megerkezett;

    public Jarmu(boolean beinditva, boolean uzemanyag, boolean megerkezett) {
        this.beinditva = beinditva;
        this.uzemanyag = uzemanyag;
        this.megerkezett = megerkezett;
    }

    public Jarmu() {

    }

    public void beindit() {
        beinditva = true;
    }

    public void leallit() {
        beinditva = false;
    }

    public boolean tankol() {
        if (!beinditva && !uzemanyag) {
            return true;
        }
        return false;
    }

    public boolean halad() {
        if (beinditva && uzemanyag) {
            return true;

        }
        return false;
    }
}

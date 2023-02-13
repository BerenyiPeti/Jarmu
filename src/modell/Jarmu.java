package modell;

public abstract class Jarmu {
    private boolean beinditva, uzemanyag, megerkezett;

    public Jarmu() {
        
    }
    
    public void beindit() {
        beinditva = true;
    }
   
    public void leallit() {
        beinditva = false;
    }
    
    public boolean tankol() {
        return uzemanyag;
    }
    
    public boolean halad() {
        return megerkezett;
    }
}

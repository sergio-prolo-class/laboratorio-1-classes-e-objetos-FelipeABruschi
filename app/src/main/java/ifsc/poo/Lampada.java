package ifsc.poo;

public class Lampada {
    private boolean ligado;

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }

    public boolean verEstado(){
        return this.ligado;
    }
}



package ifsc.poo;

public class Lampada {
    private boolean ligado;
    private static int lampadas_criadas = 0;

    private Lampada() {
        lampadas_criadas++;
        ligado = false;
    }

    private Lampada(boolean estado) {
        this.ligado = estado;
        lampadas_criadas++;
    }

    public void ligar(){this.ligado = true;}

    public void desligar(){
        this.ligado = false;
    }

    public boolean verEstado(){
        return this.ligado;
    }
}



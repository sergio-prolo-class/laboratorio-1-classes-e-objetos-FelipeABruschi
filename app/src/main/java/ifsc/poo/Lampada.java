package ifsc.poo;

public class Lampada {
    private boolean ligado;
    private static int lampadas_criadas = 0;

    public Lampada() {
        lampadas_criadas++;
        ligado = false;
    }

    public Lampada(boolean estado) {
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

    public static int getLampadasCriadas() {
        return lampadas_criadas;
    }

}



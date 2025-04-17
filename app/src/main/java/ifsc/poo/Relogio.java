package ifsc.poo;

public class Relogio {
    private byte hora = 0;
    private byte minuto = 0;
    private byte segundo = 0;

    public void ajustarHora(byte hora, byte minuto, byte segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public String getHora(){
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }

    public String getHour(){
        return String.format("%02dpm %02dm %02ds", this.hora, this.minuto, this.segundo);
    }

    public void avancaHora(){
        this.hora++;
        if(this.hora == 12)
            this.hora = 0;
    }

    public void avancaMinuto(){
        this.minuto++;
        if(this.minuto == 60){
            this.minuto = 0;
            avancaHora();
        }
    }

    public void avancaSegundo(){
        this.segundo++;
        if(this.segundo == 60){
            this.segundo = 0;
            avancaMinuto();
        }
    }

}

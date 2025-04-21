package ifsc.poo;

public class Relogio {
    private byte hora;
    private byte minuto;
    private byte segundo;

    public Relogio(byte hora){
        if(hora < 0 || hora > 23)
            this.hora = 0;
        else
            this.hora = hora;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Relogio(byte hora, byte minuto){
        if(hora < 0 || hora > 23)
            this.hora = 0;
        else
            this.hora = hora;
        if(minuto < 0 || minuto > 59)
            this.minuto = 0;
        else
            this.minuto = minuto;
        this.segundo = 0;
    }

    public Relogio(byte hora, byte minuto, byte segundo){
        if(hora < 0 || hora > 23)
            this.hora = 0;
        else
            this.hora = hora;
        if(minuto < 0 || minuto > 59)
            this.minuto = 0;
        else
            this.minuto = minuto;
        if(segundo < 0 || segundo > 59)
            this.segundo = 0;
        else
            this.segundo = segundo;
    }

    public boolean ajustarHora(byte hora, byte minuto, byte segundo){
        if(hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59)
            return false;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        return true;
    }

    public void sincroniza(Relogio relogio){
        this.hora = relogio.hora;
        this.minuto = relogio.minuto;;
        this.segundo = relogio.segundo;
    }

    public int diferenca(Relogio relogio){
        int segundos1 = this.segundo + this.minuto * 60 + this.hora * 3600;
        int segundos2 = relogio.segundo + relogio.minuto * 60 + relogio.hora * 3600;

        return segundos1 - segundos2;
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

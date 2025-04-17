package ifsc.poo;

public class Retangulo {
    private float largura;
    private float altura;

    private static Retangulo maior_area;
    private static Retangulo menor_perimetro;

    private Retangulo() {
        this.largura = 1;
        this.altura = 1;
    }

    public boolean setLargura(float largura){
        boolean valida;
        if(largura > 0) {
            this.largura = largura;
            valida = true;
        }
        else {
            this.largura = 1;
            valida = false;
        }
        return valida;
    }

    public boolean setAltura(float altura){
        boolean valida;
        if(altura > 0) {
            this.altura = altura;
            valida = true;
        }
        else {
            this.altura = 1;
            valida = false;
        }
        return valida;
    }

    public float getArea(){
        return this.largura * this.altura;
    }

    public float getPerimetro(){
        return 2 * (this.largura + this.altura);
    }
}

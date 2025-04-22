package ifsc.poo;

public class Retangulo {
    private float largura;
    private float altura;

    public static Retangulo maior_area;
    public static Retangulo menor_perimetro;

    public Retangulo(int altura, int largura) {
        this.altura = Math.max(altura, 1);
        this.largura = Math.max(largura, 1);

        verifica_estaticos(this);
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

    public static void verifica_estaticos(Retangulo retangulo){
        if(maior_area == null || retangulo.getArea() > maior_area.getArea())
            maior_area = retangulo;
        if(menor_perimetro == null || retangulo.getPerimetro() < menor_perimetro.getPerimetro())
            menor_perimetro = retangulo;
    }
}

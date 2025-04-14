package ifsc.poo;

public class Retangulo {
    private float largura;
    private float altura;

    private Retangulo() {
        this.largura = 0;
        this.altura = 0;
    }

    public void setLargura(float largura){
        if(largura > 0)
            this.largura = largura;
        else
            System.out.println("Apenas valores positivos!");
    }

    public void setAltura(float altura){
        if(altura > 0)
            this.altura = altura;
        else
            System.out.println("Apenas valores positivos!");
    }

    public float getArea(){
        return this.largura * this.altura;
    }

    public float getPerimetro(){
        return 2 * (this.largura + this.altura);
    }
}

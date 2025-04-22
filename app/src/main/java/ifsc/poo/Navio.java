package ifsc.poo;
import java.util.Random;

public class Navio {
    private int tamanho;
    private int[] linha;
    private int[] coluna;
    private char orientacao;
    private char letra;
    private int[][] posicao_atingida;
    private boolean afundado;

    public Navio(int tamanho, char letra){
        if(tamanho < 1)
            throw new RuntimeException("Tamanho deve ser positivo");
        this.tamanho = tamanho;
        this.letra = letra;


    }

    public static int posicao() {
        Random indice = new Random();
        return indice.nextInt(10);
    }

//    public boolean isAfundado(){
//
//    }
}

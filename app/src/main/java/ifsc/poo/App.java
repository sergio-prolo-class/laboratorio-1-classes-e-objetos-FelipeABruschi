/*
 * This source file was generated by the Gradle 'init' task
 */
package ifsc.poo;
import java.util.Random;

public class App {

    public static void mostrar_lampada(Lampada lampada){
        if(lampada.verEstado())
            System.out.println("Lampada ligada");
        else
            System.out.println("Lampada desligada");
    }

    public static float numero(){
        Random random = new Random();
        float numero = random.nextFloat(11);
        return numero;
    }

    public static void main(String[] args) {
        //Exercicio 1 lampada
//        Lampada lampada1 = new Lampada();
//        Lampada lampada2 = new Lampada();
//
//        lampada1.ligar();
//        lampada2.desligar();
//
//        mostrar_lampada(lampada1);
//        mostrar_lampada(lampada2);

        //Exercicio 2 pessoa
//        Pessoa pessoa1 = new Pessoa();
//        Pessoa pessoa2 = new Pessoa();
//
//        pessoa1.setNome("Alice");
//        pessoa1.setIdade(22);
//        pessoa2.setNome("Bruno");
//        pessoa2.setIdade(25);
//
//        pessoa2.felizAniversario();
//        pessoa2.felizAniversario();
//        pessoa2.felizAniversario();
//
//        System.out.println(pessoa1.getIdade());
//        System.out.println(pessoa2.getIdade());
//
//        pessoa1.setIdade(-44);
//        System.out.println(pessoa1.getIdade());
//
//        pessoa2.setNome("");
//        System.out.println(pessoa2.getNome());

        //Exercicio 3 Retangulo

//        Retangulo retangulo = new Retangulo();
//
//        retangulo.setAltura(4);
//        retangulo.setLargura(5);
//
//        System.out.println(retangulo.getArea());
//        System.out.println(retangulo.getPerimetro());
//
//        Retangulo[] retangulos = new Retangulo[10];
//
//        float maior_razao = 0;
//
//        for(int i = 0; i < 10; i++){
//            retangulos[i] = new Retangulo();
//            retangulos[i].setLargura(numero());
//            retangulos[i].setAltura(numero());
//            if(maior_razao < (retangulos[i].getArea() / retangulos[i].getPerimetro()))
//                maior_razao = (retangulos[i].getArea() / retangulos[i].getPerimetro());
//        }
//        System.out.println(maior_razao);

        //Exercicio 4

//        Relogio relogio = new Relogio();
//        relogio.ajustarHora((byte)14, (byte)58, (byte)32);
//        relogio.avancaMinuto();
//        relogio.avancaMinuto();
//
//        System.out.println(relogio.getHora());
//
//        relogio.ajustarHora((byte)23, (byte)59, (byte)59);
//        relogio.avancaSegundo();
//
//        System.out.println(relogio.getHora());
//
//        relogio.ajustarHora((byte)11, (byte)30, (byte)45);
//        System.out.println(relogio.getHour());
//        relogio.avancaHora();;
//        System.out.println(relogio.getHour());

        //Exercicio 5

        Produto geladeira = new Produto();
        Produto microondas = new Produto();

        geladeira.setNome("Geladeira");
        microondas.setNome("Micro ondas");

        geladeira.setPreco(832);
        microondas.setPreco(499);

        System.out.println(geladeira.getPreco());
        System.out.println(microondas.getPreco());

        geladeira.setDesconto(6);
        microondas.setDesconto(12);

        System.out.println(geladeira.getPreco());
        System.out.println(microondas.getPreco());

        System.out.println(geladeira.anuncio());
        System.out.println(microondas.anuncio());
    }
}

package ifsc.poo;

public class Produto {
    private String nome;
    private int preco = 0;
    private int desconto = 0;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPreco(int preco){
        this.preco = preco;
    }

    public int getPreco(){
        return this.preco;
    }

    public void setDesconto(int desconto){
        this.desconto = desconto;
        this.preco -= preco * this.desconto / 100;
    }

    public int getDesconto(){
        return this.desconto;
    }

    public String anuncio(){
        return String.format("%s: de %d por APENAS R$ %d!", this.nome, this.preco + this.preco * this.desconto / 100, this.preco);
    }

    // Nao, pois o desconto interfere no preço e fica com uma dupla interpretacao em relação ao preco
    // o preco real e o preco com desconto
}

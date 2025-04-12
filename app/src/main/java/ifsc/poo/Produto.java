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
        if(this.desconto > 0){
            this.preco -= preco * this.desconto / 100;
        }
    }

    public float getPreco(){
        return this.preco;
    }

    public void setDesconto(int desconto){
        this.desconto = desconto;
        this.preco -= preco * this.desconto / 100;
    }

    public int getDesconto(){
        return this.desconto;
    }
}

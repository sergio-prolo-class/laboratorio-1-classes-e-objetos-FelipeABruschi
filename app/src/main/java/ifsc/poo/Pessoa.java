package ifsc.poo;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
    }

    public void setNome(String nome) {
        if(!nome.isEmpty())
            this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        if(idade >= 0)
            this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void felizAniversario(){
        this.idade++;
    }
}

package ifsc.poo;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String cpf) {
        this.nome = "";
        this.idade = 0;
        if(!cpf.isEmpty())
            this.cpf = cpf;
        else
            this.cpf = "123.456.789-00";    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.idade = 0;
        if(!cpf.isEmpty())
            this.cpf = cpf;
        else
            this.cpf = "123.456.789-00";
    }

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = Math.max(idade, 0);
        if(!cpf.isEmpty())
            this.cpf = cpf;
        else
            this.cpf = "123.456.789-00";
    }

    public boolean setNome(String nome) {
        boolean valida_nome;
        if(!nome.isEmpty()) {
            this.nome = nome;
            valida_nome = true;
        }
        else
            valida_nome = false;
        return valida_nome;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean setIdade(int idade) {
        boolean valida_idade;
        if(idade >= 0) {
            this.idade = idade;
            valida_idade = true;
        }
        else
            valida_idade = false;
        return valida_idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void felizAniversario(){
        this.idade++;
    }
}

package ifsc.poo;

public class Produto {
    private String nome;
    private int preco;
    private int desconto;
    private final String codigo;

    public static int gera_codigo = 1;
    public static int quantidade_produtos = 0;
    public static Produto[] produtos = new Produto[50];
    public static int indice_produto = 0;

    public Produto(String nome, int preco) {
        if(nome.isEmpty() || preco < 0)
            throw new RuntimeException("Digite um nome e um preço válido.");
        this.nome = nome;
        this.preco = preco;
        this.desconto = 0;
        if(quantidade_produtos < 50)
            quantidade_produtos++;
        this.codigo = String.format("CD: 000-%03d", gera_codigo);
        gera_codigo++;
        if(indice_produto == 50)
            indice_produto = 0;
        produtos[indice_produto] = this;
        indice_produto++;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public boolean setNome(String nome){
        if(nome.isEmpty())
            return false;
        this.nome = nome;
        return true;
    }

    public String getNome(){
        return this.nome;
    }

    public boolean setPreco(int preco){
        if(preco < 0)
            return false;
        this.preco = preco;
        return true;
    }

    public float getPreco(){
        return (float) (this.preco - this.preco * this.desconto / 100);
    }

    public boolean setDesconto(int desconto){
        if(desconto < 0)
            return false;
        this.desconto = desconto;
        return true;
    }

    public int getDesconto(){
        return this.desconto;
    }

    public String anuncio(){
        return String.format("%s: de %d por APENAS R$ %.2f!", this.nome, this.preco, this.getPreco());
    }

    public static String[] tabela_produtos(){
        String[] tabela = new String[51];
        tabela[0] = "Código;Nome;Preço;Desconto";
        for(int i = 0, j = 1; i < quantidade_produtos; i++, j++)
            tabela[j] = produtos[i].codigo + ";" + produtos[i].nome + ";" + produtos[i].preco + ";" + produtos[i].desconto;
        return tabela;
    }
}

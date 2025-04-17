package ifsc.poo;

public class Livro {
    private String titulo;
    private String autor;
    private String[] genero = new String[2];
    private int total_paginas;
    private String[] capitulo = new String[30];
    private int[] pagina_do_capitulo = new int[30];
    private int paginas_lidas = 0;
    private int i = 0;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return this.autor;
    }

    private boolean valida_genero(String genero){

        String[] generos = {"fantasia", "aventura", "romance", "misterio", "terror", "autoajuda", "pedagogico"};
        boolean valido = true;
        for(int i = 0; i < 7; i++){
            if(!genero.equals(generos[i])){
                valido = false;
                break;
            }
        }
        return valido;
    }
    public void setGenero(String genero){
        if(this.valida_genero(genero)) {
            this.genero[0] = genero;
            this.genero[1] = null;
        }
        else
            System.out.println("Genero inválido");
    }

    public void setGenero(String genero1, String genero2){
        if(this.valida_genero(genero1))
            this.genero[0] = genero1;
        else
            System.out.println("primeiro genero  inválido");
        if(this.valida_genero(genero2))
            this.genero[1] = genero2;
        else
            System.out.println("Segundo genero inválido");
    }

//    public String getGenero(){
//
//    }

    public void setTotal_paginas(int total){
        this.total_paginas = total;
    }

    public int getTotal_paginas(){
        return this.total_paginas;
    }

    public void setCapitulo(String capitulo, int pagina){
        if(i < 30) {
            this.capitulo[i] = capitulo;
            this.pagina_do_capitulo[i] = pagina;
            i++;
        }
        else
            System.out.println("Limite de capitulos atingido.");
    }

    public void lerPaginas(int n){
        if(this.paginas_lidas + n <= this.getTotal_paginas())
            this.paginas_lidas += n;
        else
            this.paginas_lidas = this.getTotal_paginas();
    }

    public void lerPaginas(){
        if(this.paginas_lidas + 1 <= this.getTotal_paginas() )
            this.paginas_lidas++;
        else
            System.out.println("Livro terminou!");
    }

    public int getPaginas_lidas(){
        return this.paginas_lidas;
    }

    public int getCapitulo(){
        int aux;
        for(aux = i - 1; aux >= 0; aux--)
            if(this.getPaginas_lidas() >= this.pagina_do_capitulo[aux])
                break;
        return ++aux;
    }


}

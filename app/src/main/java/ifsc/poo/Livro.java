package ifsc.poo;

public class Livro {
    private String nome;
    private String autor;
    private String[] genero = new String[2];
    private int total_paginas;
    private String[] titulo = new String[30];
    private int[] paginas = new int[30];

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    private boolean generos(String genero){
        String[] generos = {"fantasia", "aventura", "romance", "misterio", "terror", "autoajuda", "pedagogico"};
        boolean valido = true;
        for(int i = 0; i < 6; i++){
            if(!generos[i].equals(genero)){
                valido = false;
                break;
            }
        }
        return valido;
    }
    public void setGenero(String genero){
        this.genero[0] = genero;
        this.genero[1] = null;
    }

    public void setGenero(String genero1, String genero2){
        this.genero[0] = genero1;
        this.genero[1] = genero2;
    }

    public void setTotal_paginas(int total){
        this.total_paginas = total;
    }
}

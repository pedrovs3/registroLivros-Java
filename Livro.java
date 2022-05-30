package com.mycompany.saf.cristiano;

public class Livro {
    
    private String titulo;
    private String autor;
    private int paginas;
    private String ISBN;
    private double valor;

    // Getter

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getPaginas(){
        return paginas;
    }
    public String getIsbn(){
        return ISBN;
    }
    public double getValor(){
        return valor;
    }

    // Setter

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    } 
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }
    public void setIsbn(String ISBN){
        this.ISBN = ISBN;
    }
    public void setValor(double valor){
        this.valor = valor;
    }

    // Métodos //

    public Livro(String titulo, String autor, int paginas, String ISBN, double valor){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.ISBN = ISBN;
        this.valor = valor;
    }

    public void exibirLivro() {
        System.out.println("-=-=-=-=-=-=");
        System.out.printf("Nome do livro: %s\n", getTitulo());
        System.out.printf("Nome do Autor: %s\n", getAutor());
        System.out.printf("Numero de Páginas: %s\n", getPaginas());
        System.out.printf("ISBN: %s\n", getIsbn());
        System.out.printf("Valor do livro: %s\n", getValor());
        System.out.println("-=-=-=-=-=-=");
    }
}

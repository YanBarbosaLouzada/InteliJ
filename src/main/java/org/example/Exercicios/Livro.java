package org.example.Exercicios;

import java.util.ArrayList;

public class Livro {
    private String nome;
    private Autor autor;
    private double preco;

    static ArrayList<Livro> livrosJk = new ArrayList<>();

    public Livro(String nome, Autor autor, double preco){
        this.autor =autor;
        this.nome =nome;
        this.preco =preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        Autor Jkh = new Autor("Jk", "Jk@gmail.com");
        Livro pedraFilosofal = new Livro("Harry Potter: E a Pedra filosofal",Jkh,50.0);

       System.out.println( pedraFilosofal.autor.getNome());

       livrosJk.add(pedraFilosofal);


    }


}

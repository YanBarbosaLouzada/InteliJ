package org.example.Exercicios.ursinho;

public class Comida {
     String nome;
     static double peso;

   Comida(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static double getPeso() {
        return peso;
    }

    public static void setPeso(double peso) {
        Comida.peso = peso;
    }
}

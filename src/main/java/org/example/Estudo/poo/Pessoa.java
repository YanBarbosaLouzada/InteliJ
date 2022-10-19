package org.example.Estudo.poo;

import java.util.ArrayList;

public class Pessoa {

    //Propriedades&Atributos de uma Pessoa
    String nome;
    String sobrenome;
    int idade;
    double peso;
    double altura;
    //Uma lista nova que guarda a pessoa
    ArrayList<Pessoa> conhecidos = new ArrayList<>();

    //Objeto criado e pronto
    Pessoa() {
        this.nome = "yan";
        this.sobrenome = "pereira";
        this.idade = 14;
        this.peso = 100;
        this.altura = 1.70;
    }

    // MAIS USADO PARA CRIAR UMA LISTA DE ATRIBUTOS
    Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }


    //  -------------------------------x--------------------------- //

    //Ações de uma pessoa

    //<tipo_retorno> nomeDoMetodo(PARAMETROS){}

    void dizOla() { //Método
        System.out.println("Olá, tudo bem ? " + this.nome);
    }

    void mostrarImc() { // DEVE retornar um valor
        double imc = this.peso / (this.altura * this.altura);
        System.out.println("O meu Imc é " + imc);
    }

    //SE QUISER CALCULAR USAR FORA DA CLASS
    double calcularImc() { // DEVE retornar um valor
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }

    // A pesssoa digita oque ela esta comendo
    void comer(String comida) {
        System.out.println("Estou comendo " + comida);
        this.peso += 1.5;
    }

            void addPessoaNova(Pessoa pessoa) { //faz a estar dentro da lista
                System.out.println(this.nome + "conheceu" + pessoa.nome + "ebaa!!");
                this.conhecidos.add(pessoa);
            }

    void cumprimentar(Pessoa pessoa) {
        this.dizOla();
        pessoa.dizOla();

        if (!this.conhecePessoa(pessoa)) ;
        //adicionando na lista se nao conhece
        this.addPessoaNova(pessoa);
        pessoa.conhecePessoa(this);
    }


    //contem na lista ?? procure com constains
    boolean conhecePessoa(Pessoa pessoa) {
        return this.conhecidos.contains(pessoa);
    }


}

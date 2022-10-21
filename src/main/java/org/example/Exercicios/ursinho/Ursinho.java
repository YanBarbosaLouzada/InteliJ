package org.example.Exercicios.ursinho;

import java.util.ArrayList;

/**
 * Crie uma classe Bichinho:
 * 	* Atributos: nome, idade, peso, bucho (lista de Comida), estaDormindo(boolean)
 * 	* Construtores: Cria bichinhos com base nos atributos nome, idade, peso. Bucho deve começar com lista vazia. estaDormindo deve iniciar false.
 * 	* Métodos:
 * 		- comer(Comida comida) => a comida deve alterar o peso do bichinho, o bichinho não come a mesma comida duas vezes. Ele não come se estiver dormindo!
 * 	  - dormir(int horas) => altera o boolean estaDormindo p/ true, para cada hora dormida o bichinho perde 10% de seu peso atual;
 * 		- acordar() => altera o boolean estaDormindo p/ false
 *
 * Crie uma classe Comida:
 * 	* Atributos: nome, peso;
 * 	* Construtores: Cria a comida com base nos parâmetros nome e peso;
 * 	* Métodos:
 * 		- getNome()
 * 		- getPeso()
 * 		*/
public class Ursinho {
    private String nome;
    private double peso;
    private int idade;
    private boolean estaDormindo;
    private ArrayList<Comida> bucho;


    Ursinho(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.estaDormindo = false;
        this.bucho = new ArrayList<>(); // vazio
    }


    //-------------------------METODOS---------------------------//

    public void comer(Comida comida){
        if (!this.estaDormindo && !this.bucho.contains(comida)) {
            this.bucho.add(comida);
            this.peso += comida.getPeso();
        }
    }
    public void dormir(int horas){
        this.estaDormindo = true;
        double ppPeso = this.peso*0.1;
        double quilosPedidos = horas*ppPeso;
        this.peso -=quilosPedidos;
        System.out.println(this.peso);
    }

    public void acordar(){
        this.estaDormindo =false;
    }

    public static void main(String[] args) {
        Ursinho ted = new Ursinho("ted",1,15.0);
        Comida batata = new Comida("Batata",5.0);




    }




}

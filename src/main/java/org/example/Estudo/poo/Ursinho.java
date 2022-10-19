package org.example.Estudo.poo;

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

    boolean comer;

     ArrayList<String> bucho= new ArrayList<String>();


    Ursinho(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.estaDormindo = false;
        this.comer= false;
    }


    //-------------------------METODOS---------------------------//



    //--- dormir--//
    void dormir(){
        this.estaDormindo = true;
    }
    void acorda(){
        this.estaDormindo = false;
    }
    void dormir(String dormir){
        if (!this.estaDormindo) {
            this.dormir();
        }
    }



    //---comer --//

    void comer(String comida){
        if (this.estaDormindo == true) {
            System.out.println("eu nao como dormindo e nem como duas comidas iguais");
        }else {

            System.out.println("Estou comendo " +comida);
            this.bucho.add(comida);
            this.peso+=(Comida.peso);
            System.out.println(peso);
        }

    }





}

package org.example.Estudo.poo;
    //-------------superclass---------//
public class Pet {
    private String nome;
    private int idade;
    protected double peso;


    //---------construtor---------------//

    public Pet(String nome, int idade, double peso){
        this.nome=nome;
        this.idade=idade;
        this.peso=peso;
    }

    //---------Ação---------//


public void fazerSom(){
    System.out.println("....");
    }
    public void comer(String comida){
        System.out.println("Estou comendo "+comida );
    }
    public void dormir(){
    System.out.println("ZZzzzzZZ");
    }
    public void brincar(){
        System.out.println("Estou brincando...");
    }

    //-----retorna o peso pre-estabelecido-----//

    public double getPeso(){
        return this.peso;
    }


    //----Mudar private peso---//

    public void SetPeso(double novoPeso){
        this.peso = novoPeso;
    }

    // ----------Tstar com Poo cachorro----------//
}

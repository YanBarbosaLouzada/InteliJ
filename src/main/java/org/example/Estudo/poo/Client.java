package org.example.Estudo.poo;

import java.time.LocalDate;

public class Client {
    private int id;
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;

    Client(int id,
           String nome,
           String sobrenome,
           LocalDate dataNascimento,
           double altura,
           double peso) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }
    public void crescer(){
        this.altura+=0.2;
    }

    //------------------------------x--------------------------//

    //getter => possibilita a leitura dos atributos

    public String getNome(){
        return  this.nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }

    //campo calculado

    public String getNameFull(){
        return this.nome +""+ this.sobrenome;
    }

    //------------------------------x--------------------------//

    // Setter=>serve para alterar o valor
    //Como o valor é alterado
    //validar o novo valor e ver se "Faz sentido"

    public void setAltura(double altura){
        this.altura =altura;
        if (altura>0 && altura < 2.51) {
            this.altura =altura;
        }else
            System.out.println("Digite uma altura menor");
        }
    }


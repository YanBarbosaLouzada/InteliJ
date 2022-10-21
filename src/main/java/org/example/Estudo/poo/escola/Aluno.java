package org.example.Estudo.poo.escola;
//--------------Criando classe--------------//
public class Aluno extends Pessoa{
    private double media;

    //---------Construtor-COM SUPER--------//
    public Aluno(String nome, String email, String cpf, double media) {
        super(nome, email, cpf);
        this.media=media;
    }





    //-----------Na sobre escrita mudamos apenas o COMPORTAMENTO-------------//
    @Override
    public void seApresentar() {
        super.seApresentar();
        System.out.println("Eu sou um aluno ocm média "+this.media);
    }

    public double getMedia(){
        return this.media;
    }

}

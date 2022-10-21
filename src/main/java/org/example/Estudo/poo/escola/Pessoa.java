package org.example.Estudo.poo.escola;
    //--------------Criando classe--------------//
public class Pessoa {
    private String nome;
    private String email;
    private String cpf;
    //---------Construtor---------//
    public Pessoa(String nome, String email, String cpf){
        this.nome=nome;
        this.email=email;
        this.cpf=cpf;
    }
    //-----------Métodos-----------//
    public void seApresentar(){
        System.out.println("Bom dia meu nome é "+this.nome);
    }
    //------------- GETT e SETT----------//
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

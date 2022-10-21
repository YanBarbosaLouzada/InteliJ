package org.example.Estudo.poo.escola;

public class Professor extends Pessoa {
    private String formação;

    public Professor(String nome, String email, String cpf, String formação) {
        super(nome, email, cpf);
        this.formação=formação;
    }

    @Override
    public void seApresentar() {
        super.seApresentar();
        System.out.println("Eu sou professor com formação em "+this.formação);
    }

    public String getFormação(){
        return this.formação;
    }


}

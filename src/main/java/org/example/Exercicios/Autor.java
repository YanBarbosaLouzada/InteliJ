package org.example.Exercicios;

public class Autor {
    private String nome;
    private String email;



    public Autor(String nome, String email){
        this.nome= nome;
        this.email= email;

    }
    //objt que ta chamando escrever o livro (THIS)
    public Livro escreverLivro (String nome, double preco ){
        Livro novoLivro = new Livro(nome, this, preco);
        return novoLivro;
    }

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
}
package org.example.Estudo.poo.escola;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno aluno =new Aluno("carlos","calor@gmail.com","23244455552",7.5);
        aluno.seApresentar();
        Professor professor = new Professor("joao","joa@gmail.com","12345679878", "ti");
        aluno.seApresentar();

        //É possivel tbm

        Pessoa pessoa12 =new Aluno("carlos","calor@gmail.com","2324445552",7.5);

        //Classe Pesssoa porem intende que é uma pessoa e um aluno

        //Polimorfismo
        ArrayList<Pessoa> pessoas =new ArrayList<>();
        pessoas.add(aluno);
        pessoas.add(professor);
        pessoas.add(pessoa12);

        for(Pessoa pessoa: pessoas){
            System.out.println("--------------------------------------------");
            pessoa.seApresentar();
        }


    }
}

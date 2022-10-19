package org.example.Estudo.poo;

public class PessoaTest {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "yan";
        pessoa1.sobrenome = "barbosa";
        pessoa1.idade = 10;
        pessoa1.peso = 100;
        pessoa1.altura = 1.70;

        pessoa1.dizOla();

        //  -------------------------------x--------------------------- //
        // Mais adequado a se fazer

        Pessoa pessoa4 = new Pessoa(
                "Pedro",
                "Gomes",
                35,
                1.75,
                30.5);

        //chamando métodos

        //void
        pessoa4.dizOla();
        pessoa4.mostrarImc();
        //Return
        double imcPessoa4 = pessoa4.calcularImc();
        System.out.println(imcPessoa4);
        //void com pessoa escrevendo
        pessoa4.comer("Batata");

        //------------------------- exemplo pessoas------------------------------//

        Pessoa pessoa5 = new Pessoa(
                "yan",
                "barboosa",
                10,
                1.70,
                78);

        Pessoa pessoa6 = new Pessoa(
                "Joao",
                "barboosa",
                10,
                1.70,
                78);


        //Nao se conhecem mas vão se conhecer dps de se comprimentar.
        pessoa5.cumprimentar(pessoa6);

    }
}

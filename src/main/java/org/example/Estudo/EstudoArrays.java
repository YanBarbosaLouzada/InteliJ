package org.example.Estudo;

import java.util.Scanner;

public class EstudoArrays {

    public static void main(String[] args) {
        // Formas de declarar arrays
        // Esquema para mostrar o valores dentro de um array
        int[] numeros = {1, 2, 3, 4, 5};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("a posicao " + i + "com valor de " + numeros[i]);
        }
        int[] numeros2 = new int[50];
        double[] notas = new double[5];
        String[] nomes = {"jose", "renato ", "yan"};
        String[] sobrenomes = new String[10];

        // O usuario que escreve o tamanho dentro de um arrey
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int quantidade = entrada.nextInt();
        boolean[] valores = new boolean[quantidade];


        //-------------------- Exemplo -----------------//
        // O usuario que escreve o tamanho dentro de um arrey//
        System.out.println("Digite o total de notas: ");
        int totalNotas = entrada.nextInt();//5

        //somente com string
        //entrada.nextLine();

        double[] notasProva = new double[totalNotas]; //0..4

        for (int i = 0; i < totalNotas; i++) {
            System.out.println("Digite o valor da nota " + i);
            notasProva[i] = entrada.nextDouble();

        }

        // tipo um for of
        //Soma das notas

        double soma = 0.0;
        for (double nota : notasProva) {
            soma += nota;
        }

        //media das notas
        double media = soma / notasProva.length;
        System.out.println("A media das suas notas é " + media);

        String mensagem = (media < 7) ? "Você está reprovado" : "Você foi aprovado";
        System.out.println(mensagem);

        // padrao de variaveis sem valor

        /**
         * int 0
         * double 0
         * long 0
         * boolean false
         * String null (ausencia de um objt)
         *
         */

        //wrapper classes

        /**
         * int Integer          1
         * double Double        1.0
         * long Lond            1L
         * boolean Bolean       false
         */


    }
}



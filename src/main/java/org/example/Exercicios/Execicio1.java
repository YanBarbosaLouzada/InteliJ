package org.example.Exercicios;

import java.util.Scanner;

public class Execicio1 {
    public static void main(String[] args) {

        /**
         * 1) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas: (switch-case)
         *
         * 1 – Adição
         * 2 – Subtração
         * 3 – Multiplicação
         * 4 – Divisão
         *
         */


        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha uma opção 1-ADIÇÃO 2-SUBTRAÇÃO 3-MULTIPLICAÇÃO 4-DIVISÃO ");
        String Calcular =entrada.nextLine();

        System.out.println("Digite o Primeiro numero");
        double numero1 = entrada.nextInt();

        System.out.println("Digite o Segundo numero");
        double numero2 = entrada.nextInt();

        double resultado = 0.0;



        switch (Calcular) {
            case "1":
                resultado = numero1+numero2;
                System.out.println("A soma dos numeros é "+resultado);
                break;
            case "2":
                resultado = numero1-numero2;
                System.out.println("A subtração dos numeros é "+resultado);
                break;
            case "3":
                resultado = numero1*numero2;
                System.out.println("A multiplicação dos numeros é "+resultado);
                break;
            case "4":
                resultado = numero1/numero2;
                System.out.println("A divisão dos numeros é "+resultado);
                break;
            default:
                System.out.println("Está dieta nao existe!");

        }


    }
}

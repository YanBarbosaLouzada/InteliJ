package org.example.Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 3 valores a serem comparados ");
        double[] notas1 = new double[3];

        System.out.println("Digite 3 valores a serem comparados com os primeiros digitados");
        double[] notas2 = new double[3];

        int inicio = 0;

        for (int i = 0; i < notas1.length -1 ; i++){
           if (notas1[i] == notas2[i]){
               inicio ++;

           }

        }
        System.out.println("Quantidade de valores identicos: " +inicio);


















    }
}

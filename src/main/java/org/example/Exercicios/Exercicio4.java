package org.example.Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade = entrada.nextInt();

        if(idade < 18){
            System.out.println("Você é menor de idade");
        } else{
            System.out.println("Você é maior de idade");

        }
    }
}

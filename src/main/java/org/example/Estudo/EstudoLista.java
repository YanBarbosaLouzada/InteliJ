package org.example.Estudo;

import java.util.ArrayList;

public class EstudoLista {
    public static void main(String[] args) {

        //array é um objto
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();

        //adicionando elmentos
        numeros.add(10); //equivale ao push no JS
        numeros.add(20);
        numeros.add(1000);
        numeros.add(1000);

        System.out.println(numeros);
        System.out.println(numeros.get(2)); // acessar uma posição expecifica

        //adiciona um novo numero no lugar de um que ja existia
        numeros.set(0, 500);
        System.out.println(numeros);

        //remove o elmento na posição 0
        numeros.remove(0);

        //Adiciona um elmento novo na posição que deseja e move o restante
        numeros.add(1, 200);

        System.out.println(numeros.size()); // ver o tamanho do array

        for (int i = 0; i < numeros.size(); i++) {
            //mostra todos os elmentos do array pulando linhas
            System.out.println(numeros.get(i));

        }

        System.out.println("-----------------------------------");


        //para cada valor dentro do array ele executa o codigo
        for (int numero : numeros) {
            System.out.println(numero);

        }

        System.out.println("-----------------------------------");

        //Se ele acha = True Se nao acha = False
        System.out.println(numeros.contains(500)); //False

        //Qual a posição da se encontra na lista!
        // Se não achar, ele te retorna -1
        System.out.println(numeros.indexOf(1000));          //2

        System.out.println(numeros.indexOf(500));           //-1

        System.out.println(numeros.indexOf(1000));          //Para ao encontrar o primeiro numero (1000).

        System.out.println(numeros.lastIndexOf(200));    //Mostra o ultimo numero encontrado(1000).


    }

}

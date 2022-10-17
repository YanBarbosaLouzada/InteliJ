package org.example.Estudo;

import java.util.Arrays;
import java.util.Scanner;

public class EstudoStrings {

    public static void main(String[] args) {
        //Strings são cadeia de caracteres.
        // y=0 a=1 n=2


        //Deu certo pois o progamador declarou no codigo

        String nome ="Yan";
        if (nome == "Yan") {
            System.out.println("São iguais");
        }
        System.out.println("digite seu sobrenome!");
        Scanner entrada = new Scanner(System.in);
        String sobrenome = entrada.nextLine();

        //Da errado pois não foi o progamador que declarou no codigo e sim o usuario.

        //Para dar certo temos que usar ---> (EQUALS) <---

        //      ------->(EQUALSIGNORECASE)<--------- Ignora letra maiuscula ou minuscula

        if (sobrenome.equals("Pereira")) {
            System.out.println("São iguais");

        }else {
            System.out.println("São diferentes");
        }

        //Outros métodos

        String java= "JAVA";
        String ja = java.substring(0, 2); // começa do 0 e VAI ATÉ 2 (Não incluso) (ja)va
        String va = java.substring(2); //corta do 2 até o final da string ja(va)

        System.out.println(ja);
        System.out.println(va);

        String m1 ="hello";
        String m2 ="Word";
        String m3 =m1.concat(m2); //m1 + m2

        System.out.println(java.length());          //quantas caracteres
        System.out.println(java.isEmpty());         //verifica se está vazia
        System.out.println(java.toUpperCase());     //caica alta (JAVA)
        System.out.println(java.toLowerCase());     //caixa baixa (java)

        String data = "13/10/2022";
        String[] valores = data.split("/"); // ["13", "10", "2022"]

        String email = "yan.barbosalouzada@gmail.com";
        String[] valroesEmail = email.split("@"); // ["yan.barbosa", "gmail.com" ]

        String nome2 ="yan barbosa";
        String[] nomeSeparado =nome2.split(" "); // -->(yan)<-- barbosa
        System.out.println(nomeSeparado[0]);

        //String yan = nome2.substring(0, 3);
        //System.out.println(yan);

        String nome3 ="yana barbosa";
        String[] nomeSeparado2 =nome2.split(""); // Silaba por silaba
        System.out.println(Arrays.toString(nomeSeparado2));




























     }

    public static class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");
        }
    }
}

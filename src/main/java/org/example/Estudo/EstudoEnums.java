package org.example.Estudo;

public class EstudoEnums {
    public static void main(String[] args) {

        // Enums são estruturas com constantes definidas

        enum DiaDaSemana{
            Segunda,
            terca,
            quarta,
            quinta,
            Sexta,
            Sabado,
            Domingo

        }

    DiaDaSemana hoje = DiaDaSemana.quinta;
        System.out.println(hoje);

        // Enum

        enum NivelDev {Junior, Pleno, Senior}
        NivelDev nivel = NivelDev.Pleno;

        switch (nivel){
            case Junior:
                System.out.println("Seu nivel e Junior");
            break;
            case Pleno:
                System.out.println("Seu nivel e Pleno");
                break;
            case Senior:
                System.out.println("Seu nivel e Senior");
                break;

        }

        //Versão Enhanced
        // VERSÃO ENHANCED
        switch(nivel) {
            case Junior -> {
                System.out.println("Seu nível é JUNIOR");
            }
            case Pleno -> {
                System.out.println("Seu nível é PLENO");
            }
            case Senior -> {
                System.out.println("Seu nível é SENIOR");
            }
            default -> {
                System.out.println("Nunca executa");
            }
        }












    }
}

package org.example.Estudo.poo;

public class Calculadora {
    public static double soma(double a, double b, double multiplicacao){
        return a +b;
    }
    public static double subtração(double a, double b ){
        return a -b;
    }

    public static double multiplicacao(double a, double b ){
        return a *b;
    }

    public static double divisao(double a, double b ){
        return a /b;
    }


    public static void main(String[] args) {
        Calculadora c1=new Calculadora();

        double resultadoSoma = Calculadora.soma(2,2, Calculadora.multiplicacao(1, 2));
        double resultadoSub = Calculadora.subtração(1,1);
        double resultadoDiv = Calculadora.divisao(2,2);
        double resultadoMult = Calculadora.multiplicacao(1,1);
    }


}

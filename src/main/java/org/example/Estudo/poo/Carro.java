package org.example.Estudo.poo;

public class Carro {
    String marca;
    int ano;
    String modelo;
    boolean Ehflex;
    int qtportas;
    double combustivelAtual;
    double consumo;
    boolean estaLigado;

    Carro(String modelo, String marca, int ano, boolean EhFlex, int qtPortas, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.qtportas = qtPortas;
        this.Ehflex = EhFlex;
        this.combustivelAtual = 30.0;   //tds começão com 30 litros;
        this.consumo =consumo ;         //qnts ltrs ele gasta por km
        this.estaLigado = false;        //tds começao com o carro desligado;
    }

    void abastecer(double total) {
        this.combustivelAtual += total;

    }

    void ligar() {
        this.estaLigado = true;
    }

    void desligar() {
        this.estaLigado = false;
    }

    //viajar
    boolean viajar(String local, double distancia) {
        if (!this.estaLigado) {
            this.ligar();
        }

        double totalLitros = distancia / this.consumo;
        if (this.combustivelAtual - totalLitros > 0) {
            this.combustivelAtual -= totalLitros;    //desconta os litros usados para a viagem
            System.out.println("A viagem para " + local+"aconteceu e sobraram " + this.combustivelAtual + "L");
            return true; //viagem aconteceu
        } else {
            return false; //a vigem nao podera acontecer
        }
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("xy","fiat",2000,true,2,40);
        carro1.abastecer(2);
        System.out.println(carro1.combustivelAtual);

        System.out.println(carro1.estaLigado);
        carro1.ligar();


    }


}
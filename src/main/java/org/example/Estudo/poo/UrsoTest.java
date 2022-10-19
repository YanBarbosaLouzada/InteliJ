package org.example.Estudo.poo;

public class UrsoTest {
    public static void main(String[] args) {
        Ursinho ursinho1 = new Ursinho("bear",10,30 );



        Comida comida1 = new Comida("batata",0.5);

        ursinho1.dormir();
        ursinho1.comer("batata");
        ursinho1.acorda();
        ursinho1.comer("batata");
    }



}

package org.example.Estudo.poo.zoo;

public interface Animal {

    //INTERFACE conjunto de metodos
    //E a class que herda deve implenmentar metodos

    void dorme();
    void fazSom();
    void comer(String comida);

}
class Gato implements Animal{


    @Override
    public void dorme() {
        System.out.println("ZZZZZZZZzzzzzz Miau");
    }

    @Override
    public void fazSom() {
        System.out.println("Miau");

    }

    @Override
    public void comer(String comida) {
        if (comida.equals("Peixe")) {
            System.out.println("Miau Miau Gostoso");
        }else {
        System.out.println("Só aceito peixe");
        }


    }

    public static void main(String[] args) {
        Gato gato = new Gato();
    }

    Animal animalGato =new Gato();
}


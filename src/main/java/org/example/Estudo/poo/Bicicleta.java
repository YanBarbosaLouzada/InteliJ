package org.example.Estudo.poo;

public class Bicicleta extends Object {
    private int marcha;
    private int velocidade;

    public Bicicleta(int marcha, int velocidade){
        this.marcha= marcha;
        this.velocidade=velocidade;
    }

    //------ apracer no print assim : -------//

    @Override
    public String toString(){ // REPRESENTAÇÃO DO OBJTO
        return "Bicicleta(marcha="+this.marcha+","+"velocidade="+this.velocidade+")";
    }

    public static void main(String[] args) {
        Bicicleta bicicleta1 =new Bicicleta(21,0);
        System.out.println(bicicleta1);



    }




}

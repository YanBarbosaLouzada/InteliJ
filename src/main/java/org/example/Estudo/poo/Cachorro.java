package org.example.Estudo.poo;

    public class Cachorro extends Pet{


    private String comidaFavorita;
    private String raca;

    //--------Criando o construtor cachorro sem esquecer do SUPER DA CLASS MÃE-------//

    public Cachorro(String nome, int idade, double peso,String comidaFavorita, String raca) {

        super(nome, idade, peso);
        this.comidaFavorita=comidaFavorita;
        this.raca=raca;

    }
        // ------ Reescrevendo ações PUBLICAS----//
    @Override
    public void fazerSom() {
        System.out.println("Au AuuuaUU");
    }

    @Override
    public void brincar() { //Late na hora de brincar
        super.brincar();
        this.fazerSom();
    }

    @Override
    public void comer(String comida) { //Descobrindo se a comida dita e a comida favorita
        if (comida.equals(this.comidaFavorita)) {
            super.comer(comida);
            //Soma o peso da comida e coloca como peso do animal
            // (PRIVATE) this.SetPeso(this.getPeso()+0.2);
            this.peso+=0.2; // (PROTECTED)

        }else {System.out.println("NAO GOSTO DE "+comida);}
    }
    public void correrAtrasMoto(){
        this.fazerSom();
        System.out.println("Correndo atras motoo AAAAAAAAAAAAA");
    }
    public static void main(String[] args) {

        //------------Testando----------------//
        Pet pet1 =new Pet("fred",3,12.1);
        pet1.dormir();

        pet1.comer("Batata");


        Cachorro rex = new Cachorro("rex",2,12,"osso","alemao");
        rex.dormir();
        rex.fazerSom();
        rex.comer("frango");
        rex.SetPeso(20);
        rex.brincar();



    }

}

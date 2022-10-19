package org.example.Estudo.poo;

import java.time.LocalDate;

public class ClientTest {
    /**
     * Encapsulamento
     * Escolhe quais atributos /métodos seram visiveis fora da classe
     * public(padrão)=> visiveis para todos e alteravel fora da classe
     * private privar seus atributos sendo assim ficando visiveis apenas dentro da classe*/
    Client client1 = new Client(

            22222,
            "Yan",
            "Barbosa",
            LocalDate.of(2002, 12, 07),
            1.70,
            82.0);


}

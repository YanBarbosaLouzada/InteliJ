package org.example.Estudo;

import java.time.LocalDate;

public class EstudoDatas {
    public static void main(String[] args) {
            // dia - mês - ano
            // LocalDate armazena qualquer data (dia, mês , ano)
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate natal = LocalDate.of(2022,12,25);
        System.out.println(natal);

        System.out.println(hoje.isAfter(natal));// Verifica se a data é depois da data especificada
        System.out.println(hoje.isBefore(natal));// Verifica se a data é antes da data especificada


        int ano =hoje.getYear();
        int mes = hoje.getMonthValue();
        int dia = hoje.getDayOfMonth();

        // Quantos dias faltão para o natal!
        // Só funciona no mesmo ano

        int diasParaNatal = natal.getDayOfYear() - hoje.getDayOfYear();

        System.out.println("Faltam "+diasParaNatal+ "dias p/ Natal!!!");




    }
}

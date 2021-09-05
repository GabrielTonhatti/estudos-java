package exercicio;

import java.util.Scanner;

public class Exercicio10 {

//    Crie uma função que recebe um número (de 1 a 12 e retorne o mês correspondente como uma string. Por
//    exemplo, se a entrada for 2, a função deverá retornar "fevereiro", pois este é o 2° mês.
//
//    Exemplos:
//
//    nomeDoMes(1) // retornará "janeiro"
//    nomeDoMes(4) // retornará "abril"

    public static void main(String[] args) {

        Metodos diaDoMes = new Metodos();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número correspondente a um mês: ");
        int dia = entrada.nextInt();
        System.out.println(diaDoMes.numeroDoMes(dia));

        entrada.close();

    }
}

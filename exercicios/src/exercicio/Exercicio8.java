package exercicio;

public class Exercicio8 {
    public static void main(String[] args) {

//        Escreva uma função que receba a idade de uma pessoa em anos e retorne a mesma idade em dias.
//
//        Obs: considere que um ano tem 365 dias. Desconsidere anos bissextos (com 366 dias) e
//        desconsidere também dias decorridos desde o último aniversário.
        Metodos idade = new Metodos();

        int idadeDias = idade.idadeDias(20);

        System.out.println("A sua idade em dias é: " + idadeDias);

    }
}

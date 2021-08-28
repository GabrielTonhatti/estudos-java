package exercicio;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor inteiro qualquer: ");
        int num = entrada.nextInt();
        System.out.println("Digite outro valor inteiro qualquer: ");
        int num2 = entrada.nextInt();

        int soma = num + num2;

        System.out.println("Soma = " + soma);


        entrada.close();
    }
}

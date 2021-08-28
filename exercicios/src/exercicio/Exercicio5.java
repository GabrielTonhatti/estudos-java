package exercicio;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o código da primeira peça: ");
        int peca1 = entrada.nextInt();

        System.out.println("Digite a quantidade de peças desejada: ");
        int qtdPecas = entrada.nextInt();

        System.out.println("Digite o valor da primeira peça: ");
        double valorP1 = entrada.nextDouble();

        System.out.println("Digite o código da segunda peça: ");
        int peca2 = entrada.nextInt();

        System.out.println("Digite a quantidade de peças desejada: ");
        int qtdPecas2 = entrada.nextInt();

        System.out.println("Digite o valor da segunda peça: ");
        double valorP2 = entrada.nextDouble();

        double totalP1 = qtdPecas * valorP1;
        double totalP2 = qtdPecas2 * valorP2;

        double total = totalP1 + totalP2;

        System.out.printf("Valor a pagar: R$ %.2f", total);


        entrada.close();
    }
}

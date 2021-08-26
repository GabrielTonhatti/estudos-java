package controle;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int aleatorio = Integer.parseInt(String.format("%.0f",Math.random() * 100));
        double num;
        int tentativa = 10;

        System.out.println("Jogo da adivinhação!!!");
        System.out.println("Digite um número qualquer e tente adivinhar qual é o número:");
        for (int i = 0; i < 10; i++) {
            num = entrada.nextDouble();

            if (num == aleatorio) {
                System.out.println("Parabéns!!! Você acertou!");
                break;
            } else {
                tentativa--;

                if (tentativa == 0) {
                    System.out.println("Você perdeu, suas tentativas acabaram!");
                } else {
                    System.out.printf("Você errou! Tente novamente, você ainda tem mais %d tentativas.\n", tentativa);
                }
            }

        }

        entrada.close();

    }
}

package controle;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número qualquer: ");
        int num = entrada.nextInt();

        if (num % 2 == 0) {
            System.out.printf("O número %d é par", num);
        } else {
            System.out.printf("O número %d é ímpar", num);
        }

        entrada.close();
    }
}

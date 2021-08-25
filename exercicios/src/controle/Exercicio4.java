package controle;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = entrada.nextInt();
        int contador = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }

        if (contador == 2 && num != 1) {
            System.out.printf("O número %d é um número primo", num);
        } else {
            System.out.printf("\nO número %d não é um número primo", num);

        }

        entrada.close();
    }

}

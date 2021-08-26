package controle;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.println("Digite um número positivo:");
        num = entrada.nextInt();
        int total =0;

        while (num > 0) {
            System.out.println("Digite outro número positivo, ou digite número negativo para encerrar o programa:");
            total += num;
            System.out.printf("O total = %d\n", total);
            num = entrada.nextInt();
        }

        entrada.close();
    }
}

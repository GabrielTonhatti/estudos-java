package controle;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        int i;
        int resto;
        int contador = 0;
        for (i = 1; i <= num; i++) {
            resto = num % i;
            switch (resto) {
                case 0:
                    contador++;
                    break;
            }
        }

        switch (contador) {
            case 2:
                System.out.printf("O número %d é um número primo", num);
                break;
            default:
                System.out.printf("O número %d não é um número primo", num);
                break;
        }

        entrada.close();
    }
}

package controle;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int maiorValor = 0;

        for(int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº valor: ", i + 1);
            int num = entrada.nextInt();

            if (num > maiorValor) {
                maiorValor = num;
            }

        }

        System.out.printf("\nO maior número digitado é %d", maiorValor);

        entrada.close();
    }
}

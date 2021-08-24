package fundamentos;

import java.util.Scanner;

public class ExercicioPotencia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor qualquer:");
        double valor = entrada.nextDouble();
        double potencia = Math.pow(valor, 2);
        double potencia2 = Math.pow(valor, 3);

        System.out.printf("O número %.2f² = %.2f, e %.2f³ = %.2f", valor, potencia, valor, potencia2);

        entrada.close();
    }
}

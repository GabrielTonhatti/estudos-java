package controle;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o ano atual, para verificar se ele é bissexto: ");
        double ano = entrada.nextInt();
        double restoDivisaoPor4 = ano % 4;
        double restoDivisaoPor100 = ano % 100;
        double restoDivisaoPor400 = ano % 400;

        System.out.printf("O resto da divisão por 4 = %.2f", restoDivisaoPor4);
        System.out.printf("\nO resto da divisão por 100 = %.2f", restoDivisaoPor100);
        System.out.printf("\nO resto da divisão por 400 = %.2f", restoDivisaoPor400);

        if (restoDivisaoPor4 == 0) {

            if (restoDivisaoPor100 == 0) {
                if (restoDivisaoPor400 == 0) {
                    System.out.printf("\nO ano %.0f é um ano bissexto!", ano);
                } else {
                    System.out.printf("\nO ano %.0f não é um ano bissexto!", ano);
                }
            } else {
                System.out.printf("\nO ano %.0f é um ano bissexto!", ano);
            }
        } else {
            System.out.printf("\nO ano %.0f não é um ano bissexto!", ano);
        }

        entrada.close();

    }
}

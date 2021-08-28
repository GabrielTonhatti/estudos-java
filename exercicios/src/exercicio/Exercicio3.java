package exercicio;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        int a = entrada.nextInt();
        System.out.println("Digite o valor de B");
        int b = entrada.nextInt();
        System.out.println("Digite o valor de C");
        int c = entrada.nextInt();
        System.out.println("Digite o valor de D");
        int d = entrada.nextInt();

        int diferenca = a * b - c * d;

        System.out.println("Diferença = " + diferenca);

        entrada.close();
    }
}

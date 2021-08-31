package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas você quer informar? ");
        int tamanho = entrada.nextInt();

        double[] notas = new double[tamanho];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("\nDigite a %dº nota: ", i + 1);
            notas[i] = entrada.nextDouble();
        }

        System.out.println(Arrays.toString(notas));

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;

        System.out.printf("A média das notas do aluno é %.2f!", media);

        entrada.close();
    }
}

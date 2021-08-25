package controle;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {

        // calcular a média da nota dos alunos
        Scanner entrada = new Scanner(System.in);

        int total = 0;
        int totalValido = 0;
        double media = 0;
        double nota = 0;

        while (nota != -1) {

            // Calcular a média
            System.out.println("Digite uma nota (\"-1\" para sair): ");
            nota = entrada.nextDouble();

            if (nota >= 0 && nota <= 10) {
                total++;
                totalValido++;
                media += nota;
            } else if (nota != -1) {
                System.out.println("Nota inválida!!! ;D");
                total++;
            } else {
                total++;
            }
        }

        media /= totalValido;

        System.out.println("\nO total de notas válidas digitadas foram: " + totalValido);
        System.out.println("O total de notas digitadas foram: " + total);
        System.out.printf("E a média das notas é %.2f ", media);

        entrada.close();

    }
}

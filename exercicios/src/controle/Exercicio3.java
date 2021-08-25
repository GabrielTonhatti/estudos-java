package controle;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        double media = (nota + nota2) / 2;

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media < 7 && media > 4) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }

        entrada.close();
    }
}

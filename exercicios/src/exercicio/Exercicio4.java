package exercicio;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número do funcioário: ");
        int funcionario = entrada.nextInt();

        System.out.println("Digite o número de horas trabalhadas do funcionário: ");
        int horas = entrada.nextInt();

        System.out.println("Digite o valor que o funcionário recebe por horas trabalhadas: ");
        double valor = entrada.nextDouble();

        double salario = valor * horas;

        System.out.printf("Number = %d ", funcionario);
        System.out.printf("Salary = U$ %.2f", salario);

        entrada.close();
    }
}

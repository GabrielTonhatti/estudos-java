package exercicio;

import java.util.Scanner;

public class Exercicio9 {
    //    Desenvolva uma função que recebe dois parâmetros, um é a quantidade de horas trabalhadas por um
    //    funcionário num mês, e o quanto ele recebe por hora. O retorno da função deve ser a string "Salário igual a R$
    //    X", em que X é o quanto o funcionário ganhou no mês.
    //    Exemplos:
    //    calcularSalario(150, 40.5) // retornará "Salário igual a R$ 6075"

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Metodos f1 = new Metodos();

        System.out.println("Digite a quantidade de horas trabalhada: ");
        int horas = entrada.nextInt();
        System.out.println("Digite o valor pago por hora: ");
        double valorHora = entrada.nextDouble();

        System.out.println(f1.calcularSalario(horas, valorHora));

        entrada.close();
    }

}

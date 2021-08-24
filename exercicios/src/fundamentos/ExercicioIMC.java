package fundamentos;

import java.util.Scanner;

public class ExercicioIMC {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu peso:");
        double peso = entrada.nextDouble();
        System.out.println("Digite a sua altura:");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("O seu IMC é %.2f", imc);


        entrada.close();

    }
}

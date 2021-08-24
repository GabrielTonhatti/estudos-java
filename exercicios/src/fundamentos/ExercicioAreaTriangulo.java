package fundamentos;

import java.util.Scanner;

public class ExercicioAreaTriangulo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a base do triângulo");
        double base = entrada.nextDouble();
        System.out.println("Digite a altura do triângulo");
        double altura = entrada.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("A área do triângulo é %.2fcm²", area);

        entrada.close();
    }
}

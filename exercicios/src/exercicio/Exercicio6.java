package exercicio;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.println("Digite o valor de A: ");
        double a = entrada.nextDouble();

        System.out.println("Digite o valor de B: ");
        double b = entrada.nextDouble();

        System.out.println("Digite o valor de C: ");
        double c = entrada.nextDouble();

        double triangulo = (a * c) / 2;
        double circulo = PI * (c * c);
        double trapezio = ((a + b) * c) / 2;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.printf("Triângulo: %.3f\n", triangulo);
        System.out.printf("Circulo: %.3f\n", circulo);
        System.out.printf("Trapezido: %.3f\n", trapezio);
        System.out.printf("Quadrado: %.3f\n", quadrado);
        System.out.printf("Retangulo: %.3f\n", retangulo);

        entrada.close();
    }
}

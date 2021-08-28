package exercicio;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final double TT = 3.14159;

        System.out.println("Digite o valor do raio do circulo: ");
        double raio = entrada.nextDouble();;

        double area = TT * (raio * raio);

        System.out.printf("Área = %.4f ", area);

        entrada.close();
    }
}

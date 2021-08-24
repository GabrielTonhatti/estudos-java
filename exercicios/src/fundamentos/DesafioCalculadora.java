package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = entrada.nextDouble();
        System.out.println("Digite a operação que deseja (+, -, *, /, %): ");
        String operador = entrada.next();

        // Lógica
        double resultado = operador.equals("+") ? num1 + num2 : 0;
        resultado = operador.equals("-") ? num1 - num2 : resultado;
        resultado = operador.equals("*") ? num1 * num2 : resultado;
        resultado = operador.equals("/") ? num1 / num2 : resultado;
        resultado = operador.equals("%") ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, resultado);

        entrada.close();

    }
}

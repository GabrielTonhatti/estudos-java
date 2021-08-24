package fundamentos;

import java.util.Scanner;

public class ExercicioConversao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = entrada.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("A temperatura %.2f ºC em Fahrenheit é %.2f ºF", celsius, fahrenheit);


        entrada.close();
    }
}

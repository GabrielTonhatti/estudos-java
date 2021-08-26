package controle;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma palavra qualquer:");
        String palavra = entrada.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.charAt(i));
        }

        entrada.close();
    }
}

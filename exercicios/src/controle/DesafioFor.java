package controle;

import java.util.ArrayList;
import java.util.List;

public class DesafioFor {

    public static void main(String[] args) {

        String valor = "#";
        for (int i = 0; i < 5; i++) {
            System.out.println(valor);
            valor += "#";
        }

        // Versão do desafio
        // Não pode usar valor numérico para controlar o laço!
        System.out.println("\nDesafio:");
        String cinco = "cinco";
        valor = "#";
        for (String i = "1"; i.length() <= cinco.length(); i += 1) {
            System.out.println(valor);
            valor += "#";
        }

        // Resposta do curso
        System.out.println("\nResposta do curso:");
        for (String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }

    }
}

package fundamentos.operadores;

public class DesafioAritmetico {

    public static void main(String[] args) {

        double fracao = Math.pow((6 * (3 + 2)), 2) / (3 * 2);
        double fracao2 = Math.pow(((1 - 5) * (2 - 7) / 2), 2);
        double divisor = Math.pow(10, 3);
        double total = Math.pow((fracao - fracao2), 3) / divisor;

        System.out.println(fracao);
        System.out.println(fracao2);
        System.out.println("O resultado é " + total);

    }
}

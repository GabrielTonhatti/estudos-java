package fundamentos.operadores;

public class DesafioLogicos {

    public static void main(String[] args) {

        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        boolean trabalho1 = false;
        boolean trabalho2 = false;
        boolean tv50 = trabalho1 && trabalho2;
        boolean tv32 = trabalho1 ^ trabalho2;
        boolean tomarSorvete = tv50 || tv32;
        boolean ficarEmCasa = !tomarSorvete; // Operador unário

        System.out.println("Comprou a TV de 50polegadas: " + tv50);
        System.out.println("Comprou a TV de 32polegadas: " + tv32);

        System.out.println("Tomar sorvete com a família: " + tomarSorvete);

        System.out.println("Ficar em casa: " + ficarEmCasa);

    }
}

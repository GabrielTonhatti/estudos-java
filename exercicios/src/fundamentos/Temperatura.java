package fundamentos;

public class Temperatura {

    public static void main(String[] args) {

        // (Fº - 32) x 5/9 = Cº
        final double FATOR = 5.0 / 9;
        final int AJUSTE = 32;

        int tempF = 86;
        double celsius = (tempF - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius + "°C");

        tempF = 0;
        celsius = (tempF - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius + "°C");

    }
}

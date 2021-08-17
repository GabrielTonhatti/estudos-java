package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

    public static void main(String[] args) {

        String valo1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String valo2 = JOptionPane.showInputDialog("Digite o segundo número:");

        System.out.println(valo1 + valo2);

        double numero1 = Double.parseDouble(valo1);
        double numero2 = Double.parseDouble(valo2);

        double soma= numero1 + numero2;

        System.out.println("Soma é: " + soma);
        System.out.println("Média é: " + soma / 2);

    }
}

package exercicio;

public class Metodos {

    String cumprimentar(String nome) {
        return "Olá, " + nome + "!";
    }

    int idadeDias(int idade) {
        return idade * 365;
    }

    String calcularSalario(int horas, double pagoPorHora) {
        double salarioDoMes = horas * pagoPorHora;

        return String.format("Salário igual a R$ %.2f", salarioDoMes);
    }

    String numeroDoMes(int num) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outrubro", "Novembro", "Dezembro"};
        String mes = "";

        for (int i = 0; i < meses.length; i++) {
            if (num == i) {
                i--;
                mes = meses[i];
                break;
            }

            if (num == 12) {
                mes = meses[meses.length - 1];
            } else {
                mes = "Digite um mês válido!!!";
            }
        }

        return mes;

    }
}

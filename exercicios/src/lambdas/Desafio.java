package lambdas;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.function.BinaryOperator;

public class Desafio {

    public static void main(String[] args) {

        Produto p = new Produto("iPad", 3235.89, 0.13);

        /*
         * 1. A partir do produto calcular o preco real (com desconto)
         * 2. Imposto Municial: >= 2500 (8,5%) / < 2500 (Isento)
         * 3. Frete: >= 3000 (100) / < 3000 (50)
         * 4. Arredondar: Deixar duas casas decimais
         * 5. Formatar: R$1234,56
         */

        BinaryOperator<Double> precoComDesconto = (v, d) -> v * (1 - d);

        double precoFinal = precoComDesconto.apply(p.preco, p.desconto);
        double frete = 0;

        if (precoFinal >= 2500) {
            precoFinal += precoFinal * 0.085;

            if (precoFinal >= 3000) {
                frete = 100;
                precoFinal += frete;
            } else if (precoFinal < 3000) {
                frete = 50;
                precoFinal += frete;
            }

        }

        precoFinal = Math.round(precoFinal * 100.0) / 100.0;

//        DecimalFormat df = new DecimalFormat("0.00");
//        df.setRoundingMode(RoundingMode.HALF_UP);
//        String precoArredondado = df.format(precoFinal);
//        System.out.println(precoArredondado);

        String precoFormatado = Double.toString(precoFinal);
        precoFormatado = precoFormatado.replace(".", ",");

        System.out.println(precoFinal);
        System.out.println("O preço final é R$" + precoFormatado);


    }

}

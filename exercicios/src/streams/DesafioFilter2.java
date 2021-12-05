package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {

    public static void main(String[] args) {

        Produtos p1 = new Produtos("Macbook Air Apple 13.3", 18598.98, 0.39, true);
        Produtos p2 = new Produtos("Notebook Alienware m15", 15698.98, 0.35, true);
        Produtos p3 = new Produtos("Samsung Odyssey 2", 9987.54, 0.31, false);
        Produtos p4 = new Produtos("MONITOR GAMER ASUS ROG SWIFT ESPORTS 24.5 FAST IPS FHD 360HZ 1MS", 7953.60, 0.30, false);
        Produtos p5 = new Produtos("Monitor Gamer Asus TUF 27' IPS, 280 Hz, Full HD, 1ms", 3555.44, 0.16, true);
        Produtos p6 = new Produtos("Smartphone Asus Zenfone 8 5G", 5239.06, 0.07, true);
        Produtos p7 = new Produtos("Cadeira Gamer Sharkoon Shark Skiller SGS4 Black Green", 2374.95, 0.25, false);
        Produtos p8 = new Produtos("Notebook asus rog Zephyrus Duo 15", 39999.99, 0.40, true);
        Produtos p9 = new Produtos("Smartphone Samsung Galaxy S21 5G, 128GB, RAM 8GB", 7072.51, 0.38, true);

        List<Produtos> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9);
        Predicate<Produtos> superDesconto = p -> p.desconto >= 0.3;
        Predicate<Produtos> temFreteGratis = p -> p.freteGratis;
        Predicate<Produtos> produtoRelevante = p -> p.preco >= 500;
        Function<Produtos, String> promocao = p -> String.format("Nome: %s, SUPER PROMOÇÃO: de R$ %.2f, por R$ %.2f", p.nome, p.preco, p.precoFinal);

        produtos
                .stream()
                .filter(superDesconto)
                .filter(temFreteGratis)
                .filter(produtoRelevante)
                .map(promocao)
                .forEach(System.out::println);
    }
}

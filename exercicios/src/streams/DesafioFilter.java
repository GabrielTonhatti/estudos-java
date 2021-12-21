package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        Produtos p1 = new Produtos("Caneta", 2.5, 0);
        Produtos p2 = new Produtos("Notebook", 7698.98, 0.25);
        Produtos p3 = new Produtos("Samsung S20", 5987.54, 0.21);
        Produtos p4 = new Produtos("Monitor Asus 27pol", 2458.59, 0.10);
        Produtos p5 = new Produtos("Cadeira Gamer", 989.95, 0.09);

        List<Produtos> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        Predicate<Produtos> ehCaro = p -> p.preco > 1500;
        Predicate<Produtos> descontoAlto = d -> d.desconto > 0.10;
        Function<Produtos, String> desconto = p -> "Produtos caros, mas com bons descontos: " + p.nome;

        produtos
                .stream()
                .filter(ehCaro)
                .filter(descontoAlto)
                .map(desconto)
                .forEach(System.out::println);

    }
}

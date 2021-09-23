package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> itens = new ArrayList<>();
    Item item = new Item();

    void adicionarItem(String nome, int qtde, double preco) {
        this.item.qtde = qtde;
        this.item.produto.preco = preco;
        this.item.produto.nome = nome;

        itens.add(item);
    }

    double obterValorTotal() {

        return 0;
    }
}

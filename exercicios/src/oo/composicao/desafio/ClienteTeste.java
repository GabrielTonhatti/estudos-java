package oo.composicao.desafio;

public class ClienteTeste {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("João");
        Compra compra1 = new Compra();

        compra1.adicionarItem("Caderno", 2, 5.98);

        System.out.println(compra1.itens);
    }
}

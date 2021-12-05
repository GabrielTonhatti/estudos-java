package streams;

public class Produtos {

    public final String nome;
    public final double preco;
    public final double desconto;
    public boolean freteGratis;
    public double precoFinal;

    public Produtos(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public Produtos(String nome, double preco, double desconto, boolean freteGratis) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.freteGratis = freteGratis;
        this.precoFinal = preco - (preco * desconto);
    }


}

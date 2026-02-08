package br.edu.ifpb.padroes.atv2.cardapio;

public class ItemMenu extends MenuComponent {

    private String nome;
    private double preco;

    public ItemMenu(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void mostrar(String indentacao) {
        System.out.println(indentacao + "- " + nome + " : R$ " + preco);
    }
}

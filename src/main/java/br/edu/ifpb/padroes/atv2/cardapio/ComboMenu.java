package br.edu.ifpb.padroes.atv2.cardapio;

import java.util.ArrayList;
import java.util.List;

public class ComboMenu extends MenuComponent {

    private String nome;
    private double desconto;
    private List<MenuComponent> itens = new ArrayList<>();

    public ComboMenu(String nome, double desconto) {
        this.nome = nome;
        this.desconto = desconto;
    }

    @Override
    public void adicionar(MenuComponent componente) {
        itens.add(componente);
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (MenuComponent item : itens) {
            total += item.getPreco();
        }
        return total - (total * desconto);
    }

    @Override
    public void mostrar(String indentacao) {
        System.out.println(indentacao + "+ " + nome + " (Total: R$ " + getPreco() + ")");
        for (MenuComponent item : itens) {
            item.mostrar(indentacao + "   ");
        }
    }
}

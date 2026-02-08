package br.edu.ifpb.padroes.atv2.cardapio;

public abstract class MenuComponent {

    public abstract double getPreco();
    public abstract void mostrar(String indentacao);


    public void adicionar(MenuComponent componente) {
        throw new UnsupportedOperationException();
    }
}

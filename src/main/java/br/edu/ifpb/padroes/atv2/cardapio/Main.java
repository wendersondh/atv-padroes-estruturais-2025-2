package br.edu.ifpb.padroes.atv2.cardapio;

public class Main {
    public static void main(String[] args) {

        MenuComponent hamburguer = new ItemMenu("Hambúrguer", 20);
        MenuComponent batata = new ItemMenu("Batata Frita", 8);
        MenuComponent refrigerante = new ItemMenu("Refrigerante", 6);
        MenuComponent sobremesa = new ItemMenu("Sobremesa", 10);

        ComboMenu comboBasico = new ComboMenu("Combo Básico", 0.1);
        comboBasico.adicionar(hamburguer);
        comboBasico.adicionar(batata);
        comboBasico.adicionar(refrigerante);

        ComboMenu comboCompleto = new ComboMenu("Combo Completo", 0.15);
        comboCompleto.adicionar(comboBasico);
        comboCompleto.adicionar(sobremesa);

        comboCompleto.mostrar("");
    }
}

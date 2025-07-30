package org.example;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = 0;
    }

    public Produto(String nome, double preco) {
        this(nome, preco, 0);
    }

    public void adicionarEstoque(int quantidade){
        if(quantidade > 0){
            estoque += quantidade;
            System.out.println("Estoque atualizado. Adicionados " + quantidade + " unidades.");
        } else {
            System.out.println("Quantidade inválida para adicionar.");
        }
    }

    public void vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para venda.");
        } else if (quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println("Venda realizada: " + quantidade + " unidades vendidas.");
        } else {
            System.out.println("Venda não realizada. Estoque insuficiente.");
        }
    }

    public void exibirResumo() {
        System.out.printf("Produto: %s\nPreço: R$ %.2f\nEstoque: %d unidades\n", nome, preco, estoque);
    }

    // Getters (opcional para uso externo)
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

}

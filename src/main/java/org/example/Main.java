package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto prod1 = new Produto("Mouse Gamer", 149.90, 10);

        // Criando produto com estoque inicial = 0
        Produto prod2 = new Produto("Teclado Mecânico", 349.90);

        // Operações com o primeiro produto
        System.out.println("=== PRODUTO 1 ===");
        prod1.exibirResumo();
        prod1.vender(3);
        prod1.adicionarEstoque(5);
        prod1.vender(15);
        prod1.exibirResumo();

        // Operações com o segundo produto
        System.out.println("\n=== PRODUTO 2 ===");
        prod2.exibirResumo();
        prod2.vender(1);
        prod2.adicionarEstoque(10);
        prod2.vender(4);
        prod2.exibirResumo();
    }
}
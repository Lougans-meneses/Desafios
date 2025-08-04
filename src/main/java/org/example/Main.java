package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta minhaConta = new Conta("Lougans", "12345", 1000.0);
        Conta contaDestino = new Conta("Fulano", "67890", 500.0);

        int opcao;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Transferir");
            System.out.println("4. Pagar");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para depositar: ");
                    double deposito = scanner.nextDouble();
                    if (minhaConta.depositar(deposito)) {
                        System.out.println("Depósito realizado com sucesso.");
                    } else {
                        System.out.println("Valor inválido.");
                    }
                    break;
                case 2:
                    System.out.print("Valor para sacar: ");
                    double saque = scanner.nextDouble();
                    if (minhaConta.sacar(saque)) {
                        System.out.println("Saque realizado com sucesso.");
                    } else {
                        System.out.println("Saldo insuficiente ou valor inválido.");
                    }
                    break;
                case 3:
                    System.out.print("Valor para transferir: ");
                    double valorTransferencia = scanner.nextDouble();
                    if (minhaConta.transferir(contaDestino, valorTransferencia)) {
                        System.out.println("Transferência realizada com sucesso.");
                    } else {
                        System.out.println("Saldo insuficiente para transferir.");
                    }
                    break;
                case 4:
                    System.out.print("Valor para pagar: ");
                    double pagamento = scanner.nextDouble();
                    if (minhaConta.pagar(pagamento)) {
                        System.out.println("Pagamento realizado com sucesso.");
                    } else {
                        System.out.println("Saldo insuficiente para pagar.");
                    }
                    break;
                case 5:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.printf("Saldo atual: R$ %.2f%n", minhaConta.getSaldo());

        } while (opcao != 5);

        scanner.close();

    }
}
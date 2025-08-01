package org.example;

public class Main {
    public static void main(String[] args) {
        // Reembolso 1: com hospedagem, menos de 7 dias
        Reembolso r1 = new Reembolso("Chistian", 2);
        double total1 = r1.calcularReembolso(250.0, 150.0, 180.0);
        r1.imprimirResumoReembolso(total1);

        // Reembolso 2: sem hospedagem, exatamente 7 dias
        Reembolso r2 = new Reembolso("Lohanny", 7);
        double total2 = r2.calcularReembolso(420.0, 90.0);
        r2.imprimirResumoReembolso(total2);

        // Reembolso 3: com hospedagem, mais de 7 dias (com bônus)
        Reembolso r3 = new Reembolso("Luiz", 15);
        double total3 = r3.calcularReembolso(730.0, 280.0, 350.0);
        r3.imprimirResumoReembolso(total3);
    }
}
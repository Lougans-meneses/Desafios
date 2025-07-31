package org.example;

public class Main {
    public static void main(String[] args) {
        // Reembolso 1: com hospedagem, menos de 7 dias
        Reembolso r1 = new Reembolso("João", 5);
        double total1 = r1.calcularReembolso(150.0, 50.0, 100.0);
        r1.imprimirResumoReembolso(total1);

        // Reembolso 2: sem hospedagem, exatamente 7 dias
        Reembolso r2 = new Reembolso("Maria", 7);
        double total2 = r2.calcularReembolso(120.0, 60.0);
        r2.imprimirResumoReembolso(total2);

        // Reembolso 3: com hospedagem, mais de 7 dias (com bônus)
        Reembolso r3 = new Reembolso("Carlos", 10);
        double total3 = r3.calcularReembolso(200.0, 80.0, 150.0);
        r3.imprimirResumoReembolso(total3);
    }
}
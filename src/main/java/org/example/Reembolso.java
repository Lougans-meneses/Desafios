package org.example;

public class Reembolso {
    private String nomeFuncionario;
    private int diasTrabalhados;

    // Metodo construtor
    public Reembolso(String nomeFuncionario, int diasTrabalhados) {
        this.nomeFuncionario = nomeFuncionario;
        this.diasTrabalhados = diasTrabalhados;
    }
    // Metodo com hospedagem
    public double calcularReembolso(double alimentacao, double transporte, double hospedagem) {
        return alimentacao + transporte + hospedagem;
    }

    // Metodo sobrecarregado sem hospedagem
    public double calcularReembolso(double alimentacao, double transporte) {
        return alimentacao + transporte;
    }

    // Imprime resumo, com bônus se diasTrabalhados > 7
    public void imprimirResumoReembolso(double valorTotal) {
        if (diasTrabalhados > 7) {
            valorTotal *= 1.10;
        }

        System.out.printf(
                "Funcionário: %s – Dias Trabalhados: %d – Reembolso Total: R$ %.2f%n",
                nomeFuncionario, diasTrabalhados, valorTotal
        );
    }
}


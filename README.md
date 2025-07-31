## Desafio – Sistema de Reembolso de Despesas

Contexto:
Você está desenvolvendo um sistema para calcular o valor de reembolso de despesas de funcionários de uma empresa. Cada funcionário pode solicitar reembolso de despesas de alimentação, transporte e hospedagem, com regras diferentes dependendo do tipo de despesa e da quantidade de dias trabalhados.

Objetivo:
Criar métodos com retorno, parâmetros, múltiplas assinaturas (sobrecarga) e uso de lógica condicional para calcular corretamente o valor de reembolso.

Requisitos:
Classe: Reembolso
Atributos:

String nomeFuncionario

int diasTrabalhados

Métodos obrigatórios:

public double calcularReembolso(double alimentacao, double transporte, double hospedagem)
→ Soma os valores e retorna o total de reembolso.

public double calcularReembolso(double alimentacao, double transporte)
→ Método sobrecarregado, calcula reembolso quando não houve hospedagem.

public void imprimirResumoReembolso(double valorTotal)
→ Imprime algo como:
"Funcionário: Carla – Dias Trabalhados: 5 – Reembolso Total: R$ 385.00"

Regra adicional:

Se o número de dias trabalhados for maior que 7, aplicar um bônus de 10% sobre o reembolso total antes de imprimir.

Classe Principal:
Crie três objetos de Reembolso, com diferentes dados.

Teste chamadas aos dois métodos calcularReembolso(...) com e sem hospedagem.

Teste a aplicação da regra de bônus.


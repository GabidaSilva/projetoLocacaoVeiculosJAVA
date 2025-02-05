package Veiculos;

import Clientes.Cliente;

public class Locacao {
    private Cliente cliente;
    private Veiculo veiculo;
    private int dias;

    public Locacao(Cliente cliente, Veiculo veiculo, int dias) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dias = dias;
    }

    // Realiza a locação de um veículo
    public void realizarLocacao() {
        if (veiculo.isDisponivel()) {
            veiculo.alugar();
            double valor = calcularValorLocacao();  // Calculando o valor da locação
            System.out.println("Locação realizada com sucesso! Valor total: R$ " + valor);
        } else {
            System.out.println("Veículo indisponível para locação.");
        }
    }

    // Calcula o valor da locação com base no veículo e nos dias
    public double calcularValorLocacao() {
        double valorBase = veiculo.getValorDiaria() * dias; // Valor base calculado a partir do veículo e dos dias de locação

        // Se o cliente for uma Pessoa Jurídica, aplica um desconto
        if (cliente instanceof Clientes.PessoaJuridica) {
            valorBase *= 0.9;  // 10% de desconto para pessoas jurídicas
        }

        return valorBase;
    }
}





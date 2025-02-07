package Veiculos;

import Clientes.Cliente;

public class Locacao {
    private Cliente cliente;
    private Veiculo veiculo;

    public Locacao(Cliente cliente, Veiculo veiculo) {
        this.cliente = cliente;
        this.veiculo = veiculo;
    }

    // Realiza a locação de um veículo
    public void realizarLocacao() {
        if (veiculo.isDisponivel()) {
            veiculo.alugar();
            double valor = calcularValorLocacao();
            System.out.println("Locação realizada com sucesso! Valor total: R$ " + valor);
        } else {
            System.out.println("Veículo indisponível para locação.");
        }
    }


    public double calcularValorLocacao() {
        double valorBase = veiculo.getValorDiaria() * cliente.getDiasLocacao();  // Acessando o diasLocacao do cliente

        // Se o cliente for uma Pessoa Jurídica, aplica um desconto
        if (cliente instanceof Clientes.PessoaJuridica) {
            valorBase *= 0.9;  // 10% de desconto para pessoas jurídicas
        }

        return valorBase;
    }

    // Devolução do veículo
    public void devolver() {
        veiculo.devolver();
    }
}






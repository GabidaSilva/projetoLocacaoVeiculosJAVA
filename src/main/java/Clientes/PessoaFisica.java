package Clientes;

import Veiculos.Veiculo;

public class PessoaFisica extends Cliente {

    public PessoaFisica(String id, String nome, String documento, String endereco, String telefone, int diasLocacao) {
        super(id, nome, documento, endereco, telefone, diasLocacao);
    }

    @Override
    public void exibirDetalhesLocacao(Veiculo veiculo) {
        // Criando locação para calcular o valor da locação
        Veiculos.Locacao locacao = new Veiculos.Locacao(this, veiculo, this.diasLocacao);
        locacao.realizarLocacao();  // Realiza a locação e imprime o valor
    }
}


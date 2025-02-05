package Clientes;

import Veiculos.Veiculo;

public class PessoaJuridica extends Cliente {

    // Construtor da classe PessoaJuridica
    public PessoaJuridica(String id, String nome, String documento, String endereco, String telefone, int diasLocacao) {
        super(id, nome, documento, endereco, telefone, diasLocacao);
    }

    // Exibe o modelo do carro e o tempo de locação
    @Override
    public void exibirDetalhesLocacao(Veiculo veiculo) {
        Veiculos.Locacao locacao = new Veiculos.Locacao(this, veiculo, this.diasLocacao);
        locacao.realizarLocacao();  // Realiza a locação e imprime o valor
    }
}

package Clientes;

import Veiculos.Veiculo;

public class PessoaFisica extends Cliente {

    public PessoaFisica(String id, String nome, String documento, String endereco, String telefone) {
        super(id, nome, documento, endereco, telefone);
    }

    @Override
    public void exibirDetalhesLocacao(Veiculo veiculo) {
        System.out.println(this.getNome() + " alugou o veículo " + veiculo.getModelo());
    }
}


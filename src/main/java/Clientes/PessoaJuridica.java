package Clientes;

import Produtos.Produto;

public class PessoaJuridica extends Cliente {

    public PessoaJuridica(String id, String nome, String documento, String endereco, String telefone) {
        super(id, nome, documento, endereco, telefone);
    }

    @Override
    public void exibirDetalhesAquisicao(Produto produto) {
        System.out.println(this.getNome() + " adquiriu o produto " + produto.getModelo());
    }
}

package Clientes;

import Veiculos.Veiculo;

public class Cliente {
    protected String id;
    protected String nome;
    protected String documento;
    protected String endereco;
    protected String telefone;
    protected int diasLocacao;

    // Construtor
    public Cliente(String id, String nome, String documento, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Getter e Setter para diasLocacao
    public int getDiasLocacao() {
        return diasLocacao;
    }

    public void setDiasLocacao(int diasLocacao) {
        this.diasLocacao = diasLocacao;
    }


    public String getNome() {
        return this.nome;
    }


    public void exibirDetalhesLocacao(Veiculo veiculo) {
        System.out.println(this.nome + " alugou o veículo " + veiculo.getModelo());
    }

    public String getId() {

        return this.id;
    }

    public String getDocumento() {
        return this.documento;
    }
}


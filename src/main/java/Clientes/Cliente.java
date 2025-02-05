package Clientes;

public abstract class Cliente {
    public String id;
    protected String nome;
    protected String documento;
    protected String endereco;
    protected String telefone;
    protected int diasLocacao;

    public Cliente(String id, String nome, String documento, String endereco, String telefone, int diasLocacao) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.diasLocacao = diasLocacao;
    }

    // Método abstrato para exibir detalhes da locação, a ser implementado pelas subclasses
    public abstract void exibirDetalhesLocacao(Veiculos.Veiculo veiculo);
}



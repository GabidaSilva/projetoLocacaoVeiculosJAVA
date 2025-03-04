package Clientes;
import Produtos.Produto;

public class Cliente {
    protected String id;
    protected String nome;
    protected String documento;
    public String endereco;
    public String telefone;
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


    public void exibirDetalhesAquisicao(Produto produto) {
        System.out.println(this.nome + " adquiriu o produto " + produto.getModelo());
    }

    public String getId() {

        return this.id;
    }

    public String getDocumento() {
        return this.documento;
    }
}


package Produtos;

import Clientes.Cliente;
import Clientes.PessoaJuridica;

public class Aquisicao {
    private Cliente cliente;
    private Produto produto;

    public Aquisicao(Cliente cliente, Produto produto) {
        if (cliente == null || produto == null) {
            throw new IllegalArgumentException("Cliente e Produto não podem ser nulos.");
        }
        this.cliente = cliente;
        this.produto = produto;
    }

    // Realiza a aquisição de um produto
    public void realizarAquisicao() {
        if (produto.isDisponivel()) {
            produto.adquirir();
            double valor = calcularValorAquisicao();
            System.out.printf("Aquisição realizada com sucesso! Valor total: R$ %.2f%n", valor);
        } else {
            System.out.println("Produto indisponível para aquisição.");
        }
    }

    // Calcula o valor da aquisição, aplicando desconto se necessário
    public double calcularValorAquisicao() {
        double valorBase = produto.getValor();

        // Se o cliente for uma Pessoa Jurídica, aplica um desconto de 10%
        if (cliente instanceof PessoaJuridica) {
            valorBase *= 0.9;
        }

        return valorBase;
    }

    // Realiza a devolução do produto
    public void devolver() {
        if (!produto.isDisponivel()) {
            produto.devolver();
            System.out.println("Produto devolvido com sucesso!");
        } else {
            System.out.println("Este produto já está disponível no sistema.");
        }
    }

    // Métodos de acesso
    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }
}






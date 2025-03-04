package Clientes;
import Produtos.Produto;
import java.util.ArrayList;
import java.util.List;

public class GerenciamentoDeProdutos {
    private List<Produto> listaProdutos;

    // Construtor correto da classe
    public GerenciamentoDeProdutos() {
        listaProdutos = new ArrayList<>();
    }

    // Adiciona um produto na lista
    public void adicionarProduto(Produto produto) {
        listaProdutos.add( produto );
        System.out.println( produto.getModelo() + " adicionado com sucesso!");
    }

    // Remove um produto da lista pelo modelo
    public void removerProduto(String modelo) {
        Produto produto = buscarProduto(modelo);
        if (produto != null) {
            listaProdutos.remove( produto );
            System.out.println( produto.getModelo() + " removido com sucesso!");
        } else {
            System.out.println("Produto " + modelo + " não encontrado.");
        }
    }

    // Busca um produto pelo modelo
    public Produto buscarProduto(String modelo) {
        for (Produto produto : listaProdutos) {
            if (produto.getModelo().equalsIgnoreCase(modelo)) {
                return produto;
            }
        }
        return null;
    }

    // Lista todos os produtos
    public void listarTodosProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("Lista de todos os produtos:");
            for (Produto produto : listaProdutos) {
                System.out.println( produto.getModelo() + " - " + produto.getCodigoDeBarras() + " - " + (produto.isDisponivel() ? "Disponível" : "Indisponível"));
            }
        }
    }

    // Lista os produtos disponíveis para aquisicao
    public void listarProdutosDisponiveis() {
        boolean encontrado = false;
        System.out.println("Produtos disponíveis para aquisição:");

        for (Produto produto : listaProdutos) {
            if (produto.isDisponivel()) {
                System.out.println( produto.getModelo() + " - " + produto.getCodigoDeBarras());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Não há produtos disponíveis no momento.");
        }
    }

    // Adquire um produto a partir do modelo
    public void adquirirProduto(String modelo) {
        Produto produto = buscarProduto(modelo);
        if (produto != null && produto.isDisponivel()) {
            produto.adquirir();
            // Comentado a linha abaixo para não imprimir "Produto [modelo] adquirido"
            // System.out.println("Produto " + produto.getModelo() + " adquirido.");
        } else {
            if (produto != null) {
                System.out.println("O produto " + modelo + " não está disponível para aquisição.");
            } else {
                System.out.println("Produto " + modelo + " não encontrado.");
            }
        }
    }

    // Devolve um produto a partir do modelo
    public void devolverProduto(String modelo) {
        Produto produto = buscarProduto(modelo);
        if (produto != null) {
            produto.devolver();
        } else {
            System.out.println("Produto " + modelo + " não encontrado.");
        }
    }
}

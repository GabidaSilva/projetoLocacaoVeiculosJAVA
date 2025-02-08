package Clientes;
import Veiculos.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoDeVeiculos {
    private List<Veiculo> listaVeiculos;

    // Construtor correto da classe
    public GerenciamentoDeVeiculos() {
        listaVeiculos = new ArrayList<>();
    }

    // Adiciona um veículo na lista
    public void adicionarVeiculo(Veiculo veiculo) {
        listaVeiculos.add(veiculo);
        System.out.println(veiculo.getModelo() + " adicionado com sucesso!");
    }

    // Remove um veículo da lista pelo modelo
    public void removerVeiculo(String modelo) {
        Veiculo veiculo = buscarVeiculo(modelo);
        if (veiculo != null) {
            listaVeiculos.remove(veiculo);
            System.out.println(veiculo.getModelo() + " removido com sucesso!");
        } else {
            System.out.println("Veículo " + modelo + " não encontrado.");
        }
    }

    // Busca um veículo pelo modelo
    public Veiculo buscarVeiculo(String modelo) {
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getModelo().equalsIgnoreCase(modelo)) {
                return veiculo;
            }
        }
        return null;
    }

    // Lista todos os veículos
    public void listarTodosVeiculos() {
        if (listaVeiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            System.out.println("Lista de todos os veículos:");
            for (Veiculo veiculo : listaVeiculos) {
                System.out.println(veiculo.getModelo() + " - " + veiculo.getPlaca() + " - " + (veiculo.isDisponivel() ? "Disponível" : "Indisponível"));
            }
        }
    }

    // Lista os veículos disponíveis para aluguel
    public void listarVeiculosDisponiveis() {
        boolean encontrado = false;
        System.out.println("Veículos disponíveis para aluguel:");

        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.isDisponivel()) {
                System.out.println(veiculo.getModelo() + " - " + veiculo.getPlaca());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Não há veículos disponíveis no momento.");
        }
    }

    // Aluga um veículo a partir do modelo
    public void alugarVeiculo(String modelo) {
        Veiculo veiculo = buscarVeiculo(modelo);
        if (veiculo != null && veiculo.isDisponivel()) {
            veiculo.alugar();
            // Comentado a linha abaixo para não imprimir "Veículo [modelo] alugado"
            // System.out.println("Veículo " + veiculo.getModelo() + " alugado.");
        } else {
            if (veiculo != null) {
                System.out.println("O veículo " + modelo + " não está disponível para aluguel.");
            } else {
                System.out.println("Veículo " + modelo + " não encontrado.");
            }
        }
    }

    // Devolve um veículo a partir do modelo
    public void devolverVeiculo(String modelo) {
        Veiculo veiculo = buscarVeiculo(modelo);
        if (veiculo != null) {
            veiculo.devolver();
        } else {
            System.out.println("Veículo " + modelo + " não encontrado.");
        }
    }
}

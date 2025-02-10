import Clientes.Cliente;
import Veiculos.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Veiculo> veiculos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    listarClientes();
                    break;
                case 3:
                    removerCliente();
                    break;
                case 4:
                    cadastrarVeiculo();
                    break;
                case 5:
                    listarVeiculos();
                    break;
                case 6:
                    removerVeiculo();
                    break;
                case 7:
                    alugarVeiculo();
                    break;
                case 8:
                    devolverVeiculo();
                    break;
                case 9:
                    listarVeiculosDisponiveis();
                    break;
                case 10:
                    listarVeiculosLocados();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n=== MENU DE OPÇÕES ===");
        System.out.println("1. Cadastrar cliente");
        System.out.println("2. Listar clientes");
        System.out.println("3. Remover cliente");
        System.out.println("4. Cadastrar veículo");
        System.out.println("5. Listar veículos");
        System.out.println("6. Remover veículo");
        System.out.println("7. Alugar veículo");
        System.out.println("8. Devolver veículo alugado");
        System.out.println("9. Listar veículos disponíveis");
        System.out.println("10. Listar veículos locados");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarCliente() {
        System.out.print("Nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.println("Pessoa física (1) ou Pessoa Jurídica (2)?");
        int tipoCliente = scanner.nextInt();
        while (tipoCliente != 1 && tipoCliente != 2) {
            System.out.println("Pessoa física (1) ou Pessoa Jurídica (2)?");
            tipoCliente = scanner.nextInt();
        }
        String documento = "";
        switch (tipoCliente) {
                case 1: {
                    System.out.print("Favor inserir o CPF (11 dígitos): ");
                    scanner.nextLine();
                    documento = scanner.nextLine();
                        while (documento.length() != 11) {
                            System.out.print("Favor inserir o CPF (11 dígitos): ");
                            documento = scanner.nextLine();
                    }
                        break;
                }
                case 2: {
                    System.out.print("Documento CNPJ: ");
                    scanner.nextLine();
                    documento = scanner.nextLine();
                    while (documento.length() != 14) {
                        System.out.print("Favor inserir o CNPJ (14 dígitos): ");
                        documento = scanner.nextLine();
                    }
                    break;
                }
        }

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        Cliente cliente = new Cliente(String.valueOf(clientes.size() + 1), nome, documento, endereco, telefone);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Não há clientes cadastrados.");
        } else {
            System.out.println("=== LISTA DE CLIENTES ===");
            for (Cliente cliente : clientes) {
                System.out.println("ID: " + cliente.getId() + ", Nome: " + cliente.getNome() + ", Documento: " + cliente.getDocumento());
            }
        }
    }

    private static void removerCliente() {
        System.out.print("Digite o ID do cliente a ser removido: ");
        String id = scanner.nextLine();
        Cliente clienteRemover = null;
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                clienteRemover = cliente;
                break;
            }
        }
        if (clienteRemover != null) {
            clientes.remove(clienteRemover);
            System.out.println("Cliente removido com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private static void cadastrarVeiculo() {
        System.out.println("Qual o tipo do veículo?");
        System.out.println("1. Caminhao");
        System.out.println("2. Carro Comum");
        System.out.println("3. Carro Premium");
        System.out.println("4. Carro SUV");
        System.out.println("5. Moto");
        int tipoVeiculo = scanner.nextInt();
        while (tipoVeiculo < 1 || tipoVeiculo > 5) {
            System.out.println("Insira um número válido:");
            tipoVeiculo = scanner.nextInt();
        }

        System.out.print("Modelo do veículo: ");
        scanner.nextLine();
        String modelo = scanner.nextLine();
        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Valor da diária: ");
        double valorDiaria = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha

        switch (tipoVeiculo) {
            case 1:
                Caminhao caminhao = new Caminhao(modelo, placa, valorDiaria);
                veiculos.add(caminhao);
            case 2:
                CarroComum carroComum = new CarroComum(modelo, placa, valorDiaria);
                veiculos.add(carroComum);
            case 3:
                CarroPremium carroPremium = new CarroPremium(modelo, placa, valorDiaria);
                veiculos.add(carroPremium);
            case 4:
                CarroSUV carroSUV = new CarroSUV(modelo, placa, valorDiaria);
                veiculos.add(carroSUV);
            case 5:
                Moto moto = new Moto(modelo, placa, valorDiaria);
                veiculos.add(moto);
        }
        System.out.println("Veículo cadastrado com sucesso!");
    }

    private static void listarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Não há veículos cadastrados.");
        } else {
            System.out.println("=== LISTA DE VEÍCULOS ===");
            for (Veiculo veiculo : veiculos) {
                System.out.println("Modelo: " + veiculo.getModelo() + ", Placa: " + veiculo.getPlaca() + ", Disponível: " + (veiculo.isDisponivel() ? "Sim" : "Não"));
            }
        }
    }

    private static void removerVeiculo() {
        System.out.print("Digite a placa do veículo a ser removido: ");
        String placa = scanner.nextLine();
        Veiculo veiculoRemover = null;
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                veiculoRemover = veiculo;
                break;
            }
        }
        if (veiculoRemover != null) {
            veiculos.remove(veiculoRemover);
            System.out.println("Veículo removido com sucesso!");
        } else {
            System.out.println("Veículo não encontrado.");
        }
    }

    private static void alugarVeiculo() {
        System.out.print("Digite o ID do cliente: ");
        String idCliente = scanner.nextLine();
        System.out.print("Digite a placa do veículo: ");
        String placaVeiculo = scanner.nextLine();

        Cliente cliente = null;
        Veiculo veiculo = null;

        for (Cliente c : clientes) {
            if (c.getId().equals(idCliente)) {
                cliente = c;
                break;
            }
        }

        for (Veiculo v : veiculos) {
            if (v.getPlaca().equals(placaVeiculo) && v.isDisponivel()) {
                veiculo = v;
                break;
            }
        }

        if (cliente != null && veiculo != null) {
            veiculo.alugar();
            System.out.println("Veículo alugado com sucesso para " + cliente.getNome());
        } else {
            System.out.println("Não foi possível realizar a locação. Verifique os dados informados.");
        }
    }

    private static void devolverVeiculo() {
        System.out.print("Digite a placa do veículo a ser devolvido: ");
        String placaVeiculo = scanner.nextLine();

        Veiculo veiculo = null;
        for (Veiculo v : veiculos) {
            if (v.getPlaca().equals(placaVeiculo) && !v.isDisponivel()) {
                veiculo = v;
                break;
            }
        }

        if (veiculo != null) {
            veiculo.devolver();
            System.out.println("Veículo devolvido com sucesso!");
        } else {
            System.out.println("Veículo não encontrado ou não está alugado.");
        }
    }

    private static void listarVeiculosDisponiveis() {
        System.out.println("=== VEÍCULOS DISPONÍVEIS ===");
        boolean temDisponivel = false;
        for (Veiculo veiculo : veiculos) {
            if (veiculo.isDisponivel()) {
                System.out.println("Modelo: " + veiculo.getModelo() + ", Placa: " + veiculo.getPlaca());
                temDisponivel = true;
            }
        }
        if (!temDisponivel) {
            System.out.println("Não há veículos disponíveis no momento.");
        }
    }

    private static void listarVeiculosLocados() {
        System.out.println("=== VEÍCULOS LOCADOS ===");
        boolean temLocado = false;
        for (Veiculo veiculo : veiculos) {
            if (!veiculo.isDisponivel()) {
                System.out.println("Modelo: " + veiculo.getModelo() + ", Placa: " + veiculo.getPlaca());
                temLocado = true;
            }
        }
        if (!temLocado) {
            System.out.println("Não há veículos locados no momento.");
        }
    }
}


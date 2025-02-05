import Clientes.PessoaFisica;
import Clientes.PessoaJuridica;
import Veiculos.CarroComum;
import Veiculos.Veiculo;
import Clientes.GerenciamentoDeVeiculos;

public class Main {
    public static void main(String[] args) {
        // Criando o sistema de gerenciamento de veículos
        GerenciamentoDeVeiculos sistemaGerenciamento = new GerenciamentoDeVeiculos();

        // Criando alguns veículos
        Veiculo carro1 = new CarroComum("Palio", "ABC-1234", 100.0);
        Veiculo carro2 = new CarroComum("Civic", "XYZ-5678", 200.0);

        // Adicionando os veículos ao sistema de gerenciamento
        sistemaGerenciamento.adicionarVeiculo(carro1);
        sistemaGerenciamento.adicionarVeiculo(carro2);

        // Criando clientes
        PessoaFisica cliente1 = new PessoaFisica("1", "João Silva", "123.456.789-00", "Rua A", "1234-5678", 5);
        PessoaJuridica cliente2 = new PessoaJuridica("2", "Empresa X", "12.345.678/0001-90", "Rua B", "9876-5432", 7);

        // Exibindo os detalhes de locação para Pessoa Física
        cliente1.exibirDetalhesLocacao(carro1);

        // Exibindo os detalhes de locação para Pessoa Jurídica
        cliente2.exibirDetalhesLocacao(carro2);

        // Alugando um veículo (carro1)
        sistemaGerenciamento.alugarVeiculo("Palio");

        // Listando veículos disponíveis após o aluguel
        sistemaGerenciamento.listarVeiculosDisponiveis();

        // Devolvendo um veículo (carro1)
        sistemaGerenciamento.devolverVeiculo("Palio");

        // Listando veículos disponíveis após a devolução
        sistemaGerenciamento.listarVeiculosDisponiveis();
    }
}



import Clientes.PessoaFisica;
import Clientes.PessoaJuridica;
import Veiculos.CarroComum;
import Veiculos.Moto;
import Veiculos.Caminhao;
import Veiculos.Veiculo;
import Clientes.GerenciamentoDeVeiculos;

public class Main {
    public static void main(String[] args) {
        // Criando o sistema de gerenciamento de veículos
        GerenciamentoDeVeiculos sistemaGerenciamento = new GerenciamentoDeVeiculos();

        // Criando alguns veículos
        Veiculo carro1 = new CarroComum("Palio", "ABC-1234", 100.0);
        Veiculo carro2 = new CarroComum("Civic", "XYZ-5678", 200.0);
        Veiculo moto1  = new Moto      ("Honda CB500", "CBR-9012", 50.00);
        Veiculo moto2  = new Moto      ("Yamaha R1",   "RSC-3456", 80.00);
        Veiculo caminhao1 = new Caminhao("Volvo VM 330", "CBA-4321", 3000.00);
        Veiculo caminhao2 = new Caminhao("Daf CF85","CFG-2169",4000.00);



        // Adicionando os veículos ao sistema de gerenciamento
        sistemaGerenciamento.adicionarVeiculo(carro1);
        sistemaGerenciamento.adicionarVeiculo(carro2);
        sistemaGerenciamento.adicionarVeiculo(moto1);
        sistemaGerenciamento.adicionarVeiculo(moto2);
        sistemaGerenciamento.adicionarVeiculo(caminhao1);
        sistemaGerenciamento.adicionarVeiculo(caminhao2);

        // Criando clientes
        PessoaFisica cliente1 = new PessoaFisica("1", "João Silva", "123.456.789-00", "Rua A", "1234-5678", 5);
        PessoaFisica cliente3 = new PessoaFisica("3", "Luiz", "987.654.321-00", "Rua C", "9876-5432", 2);
        PessoaFisica cliente5 = new PessoaFisica("5","Breno","897.123.465-00","Rua E","9983-651",4);
        PessoaJuridica cliente2 = new PessoaJuridica("2", "Empresa X", "12.345.678/0001-90", "Rua B", "9876-5432", 7);
        PessoaJuridica cliente4 = new PessoaJuridica("4", "LCSR", "876.543.210/0001-70", "Rua D", "9722-5858", 3);
        PessoaJuridica cliente6 = new PessoaJuridica("6","Daza","65.235.874/001-50","Rua O","977-6969",6);

        // Exibindo os detalhes de locação para Pessoa Física
        cliente1.exibirDetalhesLocacao(carro1);
        cliente3.exibirDetalhesLocacao(moto1);
        cliente5.exibirDetalhesLocacao(caminhao1);

        // Exibindo os detalhes de locação para Pessoa Jurídica
        cliente2.exibirDetalhesLocacao(carro2);
        cliente3.exibirDetalhesLocacao(moto2);
        cliente6.exibirDetalhesLocacao(caminhao2);

        // Alugando um veículo (carro)
        sistemaGerenciamento.alugarVeiculo("Palio");
        sistemaGerenciamento.alugarVeiculo("Civic");

        // Alugando um veículo (moto)
        sistemaGerenciamento.alugarVeiculo("Honda CB500");
        sistemaGerenciamento.alugarVeiculo("Yamaha R1");

        // Alugando um veículo (caminhão)
        sistemaGerenciamento.alugarVeiculo("Volvo VM 330");
        sistemaGerenciamento.alugarVeiculo("Daf CF85");

        // Listando veículos disponíveis após o aluguel
        sistemaGerenciamento.listarVeiculosDisponiveis();

        // Devolvendo um veículo (carro1)
        sistemaGerenciamento.devolverVeiculo("Palio");

        // Devolvendo um veículo (moto)
        sistemaGerenciamento.devolverVeiculo("Honda CB500");
        sistemaGerenciamento.devolverVeiculo("Yamaha R1");

        // Devolvendo um veículo (caminhão)
        sistemaGerenciamento.devolverVeiculo("Volvo VM 330");
        sistemaGerenciamento.devolverVeiculo("Daf CF85");

        // Listando veículos disponíveis após a devolução
        sistemaGerenciamento.listarVeiculosDisponiveis();
    }
}



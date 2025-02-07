import Clientes.PessoaFisica;
import Clientes.PessoaJuridica;
import Veiculos.CarroComum;
import Veiculos.Moto;
import Veiculos.Caminhao;
import Veiculos.CarroPremium;
import Veiculos.Veiculo;
import Clientes.GerenciamentoDeVeiculos;
import Veiculos.Locacao;

public class Main {
    public static void main(String[] args) {
        // Criando o sistema de gerenciamento de veículos
        GerenciamentoDeVeiculos sistemaGerenciamento = new GerenciamentoDeVeiculos();

        // Criando alguns veículos
        Veiculo carro1 = new CarroComum("Palio", "ABC-1234", 100.0);
        Veiculo carro2 = new CarroComum("Civic", "XYZ-5678", 200.0);
        Veiculo carroPremium1 = new CarroPremium("Audi A8", "AAA-9876", 500.0);
        Veiculo moto1 = new Moto("Honda CB500", "CBR-9012", 50.00);
        Veiculo caminhao1 = new Caminhao("Volvo VM 330", "CBA-4321", 3000.00);
        Veiculo caminhao2 = new Caminhao("Daf CF85", "CFG-2169", 4000.00);

        // Adicionando os veículos ao sistema de gerenciamento
        sistemaGerenciamento.adicionarVeiculo(carro1);
        sistemaGerenciamento.adicionarVeiculo(carro2);
        sistemaGerenciamento.adicionarVeiculo(carroPremium1);
        sistemaGerenciamento.adicionarVeiculo(moto1);
        sistemaGerenciamento.adicionarVeiculo(caminhao1);
        sistemaGerenciamento.adicionarVeiculo(caminhao2);

        // Criando clientes
        PessoaFisica cliente1 = new PessoaFisica("1", "João Silva", "123.456.789-00", "Rua A", "1234-5678");
        cliente1.setDiasLocacao(5);
        PessoaFisica cliente2 = new PessoaFisica("2", "Luiz", "987.654.321-00", "Rua C", "9876-5432");
        cliente2.setDiasLocacao(2);
        PessoaFisica cliente3 = new PessoaFisica("3", "Breno", "897.123.465-00", "Rua E", "9983-651");
        cliente3.setDiasLocacao(4);
        PessoaJuridica cliente4 = new PessoaJuridica("4", "Empresa X", "12.345.678/0001-90", "Rua B", "9876-5432");
        cliente4.setDiasLocacao(7);
        PessoaJuridica cliente5 = new PessoaJuridica("5", "LCSR", "876.543.210/0001-70", "Rua D", "9722-5858");
        cliente5.setDiasLocacao(3);
        PessoaJuridica cliente6 = new PessoaJuridica("6", "Daza", "65.235.874/001-50", "Rua O", "977-6969");
        cliente6.setDiasLocacao(6);

        // Realizando locações para cada cliente
        Locacao locacao1 = new Locacao(cliente1, carro1);
        Locacao locacao2 = new Locacao(cliente2, carro2);
        Locacao locacao3 = new Locacao(cliente3, carroPremium1);
        Locacao locacao4 = new Locacao(cliente4, caminhao1);
        Locacao locacao5 = new Locacao(cliente5, caminhao2);
        Locacao locacao6 = new Locacao(cliente6, moto1);

        // Realizando as locações
        locacao1.realizarLocacao();
        locacao2.realizarLocacao();
        locacao3.realizarLocacao();
        locacao4.realizarLocacao();
        locacao5.realizarLocacao();
        locacao6.realizarLocacao();

        // Exibindo os detalhes de locação de forma simplificada
        System.out.println("-------------- Início da Locação --------------");
        System.out.println(cliente1.getNome() + " alugou o veículo: " + carro1.getModelo());
        System.out.println(cliente2.getNome() + " alugou o veículo: " + carro2.getModelo());
        System.out.println(cliente3.getNome() + " alugou o veículo: " + carroPremium1.getModelo());

        // Se o veículo for premium, adiciona o detalhe do câmbio automático
        if (carroPremium1 instanceof CarroPremium) {
            System.out.println(carroPremium1.getModelo() + " tem câmbio automático.");
        }

        System.out.println(cliente4.getNome() + " alugou o veículo: " + caminhao1.getModelo());
        System.out.println(cliente5.getNome() + " alugou o veículo: " + caminhao2.getModelo());
        System.out.println(cliente6.getNome() + " alugou o veículo: " + moto1.getModelo());
        System.out.println("-------------- Fim da Locação --------------");

        System.out.println();

        // Devolvendo os veículos e mostrando apenas o valor total
        System.out.println("-------------- Início da Devolução --------------");

        System.out.println(cliente1.getNome() + " devolveu o veículo: " + carro1.getModelo() + ". Valor da locação: R$ " + locacao1.calcularValorLocacao());
        locacao1.devolver();

        System.out.println(cliente2.getNome() + " devolveu o veículo: " + carro2.getModelo() + ". Valor da locação: R$ " + locacao2.calcularValorLocacao());
        locacao2.devolver();

        System.out.println(cliente3.getNome() + " devolveu o veículo: " + carroPremium1.getModelo() + ". Valor da locação: R$ " + locacao3.calcularValorLocacao());
        locacao3.devolver();

        System.out.println(cliente4.getNome() + " devolveu o veículo: " + caminhao1.getModelo() + ". Valor da locação: R$ " + locacao4.calcularValorLocacao());
        locacao4.devolver();

        System.out.println(cliente5.getNome() + " devolveu o veículo: " + caminhao2.getModelo() + ". Valor da locação: R$ " + locacao5.calcularValorLocacao());
        locacao5.devolver();

        System.out.println(cliente6.getNome() + " devolveu o veículo: " + moto1.getModelo() + ". Valor da locação: R$ " + locacao6.calcularValorLocacao());
        locacao6.devolver();

        System.out.println("-------------- Fim da Devolução --------------");

        System.out.println();

        // Listando veículos disponíveis após a devolução
        System.out.println("-------------- Veículos Disponíveis --------------");
        sistemaGerenciamento.listarVeiculosDisponiveis();
        System.out.println("-------------- Fim da Listagem --------------");
    }
}


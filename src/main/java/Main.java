import Clientes.Cliente;
import Clientes.PessoaFisica;
import Veiculos.CarroPremium;
import Veiculos.Locacao;
import Veiculos.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo carro1 = new CarroPremium( "BMW", "ABC1A001", 250.0 );
        Cliente cliente1 = new PessoaFisica("Joao Ferreira", "123.345.567-89","", "");

        Locacao locacao = new Locacao(cliente1, carro1, 3 );

        // COLOQUEI AQUI ESTES DADOS DE BESTEIRA, AQUI PRECISA DE SCANNER PARA COLETAR DADOS.
        // AQUI SERÁ A AREA PARA TESTES E RELATÓRIOS.

        System.out.println("here");

    }
}
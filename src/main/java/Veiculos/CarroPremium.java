package Veiculos;

public class CarroPremium extends Veiculo implements ServicoLuxo {
    private boolean cambioAutomaticoAtivo = true;

    public CarroPremium(String modelo, String placa, double valorDiaria) {
        super(modelo, placa, valorDiaria);
    }

    @Override
    public String getTipo() {
        return "Carro Premium";
    }

    @Override
    public void oferecerServicoPremium() {
        System.out.println("Serviço Premium " + getModelo());

        // Exibindo que o carro possui câmbio automático
        System.out.println("Este carro está equipado com câmbio automático.");
    }
}

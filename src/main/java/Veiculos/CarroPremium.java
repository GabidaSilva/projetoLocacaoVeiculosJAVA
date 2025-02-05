package Veiculos;

public class CarroPremium extends Veiculo implements ServicoLuxo {
    public CarroPremium(String modelo, String placa, double valorDiaria){
        super(modelo, placa, valorDiaria);
    }

    @Override
    public String getTipo() {
        return "Carro Premium";
    }

    @Override
    public void oferecerServicoPremium(){
        System.out.println("Serviço de luxo ativado para " + getModelo());
    }
}


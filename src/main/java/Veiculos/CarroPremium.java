package Veiculos;

public class CarroPremium extends Veiculo implements ServicoLuxo {

    private boolean cambioAutomatico;
    private boolean computadorBordo;

    public CarroPremium(String modelo, String placa, double valorDiaria){
        super(modelo, placa, valorDiaria);
        this.cambioAutomatico = true;
        this.computadorBordo = true;
    }

    @Override
    public boolean ofereceServicoLuxo() {
        return true; // Carro Premium oferece dois diferenciais do luxo
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

